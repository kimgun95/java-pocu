package academy.pocu.comp2500.lab11;

import academy.pocu.comp2500.lab11.pocu.PermanentlyClosedException;
import academy.pocu.comp2500.lab11.pocu.User;
import academy.pocu.comp2500.lab11.pocu.Warehouse;
import academy.pocu.comp2500.lab11.pocu.WarehouseType;
import academy.pocu.comp2500.lab11.pocu.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public final class App {

    public App() {
    }
    public void run(BufferedReader in, PrintStream out, PrintStream err) throws IOException {
        while (true) {
            printWarehouse(out);

            if (selectWarehouse(in, out, err) == true) {
                in.close();
                return;
            } else {
                continue;
            }
        }
    }
    private static final void printWarehouse(PrintStream out) {
        out.println("WAREHOUSE: Choose your warehouse!");
        int idx = 1;
        for (WarehouseType type : WarehouseType.values()) {
            out.println(idx + ". " + type);
            idx += 1;
        }
    }
    private static final Boolean selectWarehouse(BufferedReader in, PrintStream out, PrintStream err) throws IOException {
        String inputValue = in.readLine();

        if (inputValue.equals("exit")) {
            return true;
        }
        try {
            int inputIntValue = Integer.parseInt(inputValue);
            if (inputIntValue >= 1 && inputIntValue <= WarehouseType.values().length) {
                int idx = 1;
                for (WarehouseType type : WarehouseType.values()) {
                    if (inputIntValue == idx) {
                        return showWallet(in, out, err, type);
                    }
                    idx += 1;
                }
                return false;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }
    private static final Boolean showWallet(BufferedReader in, PrintStream out, PrintStream err, WarehouseType type) {
        User user = new User();
        Warehouse warehouse = new Warehouse(type);
        try {

            SafeWallet wallet = new SafeWallet(user);
            while (true) {
                out.println("BALANCE: " + wallet.getAmount());
                if (showProductList(in, out, err, warehouse, wallet) == true) {
                    return true;
                }
            }
        } catch (IllegalAccessException e) {
            err.println("AUTH_ERROR");
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    private static final Boolean showProductList(BufferedReader in, PrintStream out, PrintStream err, Warehouse warehouse, SafeWallet wallet) throws IOException {
        out.println("PRODUCT_LIST: Choose the product you want to buy!");
        int idx = 1;
        for (Product p : warehouse.getProducts()) {
            out.printf("%d. %-10s %10d%s", idx, p.getName(), p.getPrice(), System.lineSeparator());
            idx += 1;
        }
        return selectProductList(in, out, err, warehouse, wallet);
    }
    private static final boolean selectProductList(BufferedReader in, PrintStream out, PrintStream err, Warehouse warehouse, SafeWallet wallet) throws IOException {
        String inputValue = in.readLine();

        if (inputValue.equals("exit")) {
            return true;
        }
        try {
            int inputIntValue = Integer.parseInt(inputValue);
            if (inputIntValue >= 1 && inputIntValue <= warehouse.getProducts().size()) {
                int idx = 1;
                for (Product product : warehouse.getProducts()) {
                    if (inputIntValue == idx) {
                        return buyProduct(in, out, err, warehouse, wallet, product);
                    }
                    idx += 1;
                }
                return false;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    private static final boolean buyProduct(BufferedReader in, PrintStream out, PrintStream err, Warehouse warehouse, SafeWallet wallet, Product product) {
        for (Product p : warehouse.getProducts()) {
            if (product.getId() == p.getId()) {
                wallet.withdraw(p.getPrice());
                warehouse.removeProduct(p.getId());
                return false;
            }
        }
        return false;
    }
}
