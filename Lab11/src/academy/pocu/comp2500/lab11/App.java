package academy.pocu.comp2500.lab11;

import academy.pocu.comp2500.lab11.pocu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public final class App {

    public App() {
    }
    public void run(BufferedReader in, PrintStream out, PrintStream err) throws IOException {
        while (true) {
            printWarehouse();

            if (selectWarehouse(in, out, err) == true) {
                in.close();
                return;
            } else {
                continue;
            }
        }
    }
    private static void printWarehouse() {
        System.out.println("WAREHOUSE: Choose your warehouse!");
        int idx = 1;
        for (WarehouseType type : WarehouseType.values()) {
            System.out.println(idx + ". " + type);
            idx += 1;
        }
    }
    private static Boolean selectWarehouse(BufferedReader in, PrintStream out, PrintStream err) throws IOException {
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
    private static Boolean showWallet(BufferedReader in, PrintStream out, PrintStream err, WarehouseType type) {
        User user = new User();
        try {
            Wallet wallet = new Wallet(user);
            System.out.println("BALANCE: " + wallet.getAmount());
            return showProductList(in, out, err, type);
        } catch (IllegalAccessException e) {
            err.println("AUTH_ERROR");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    private static Boolean showProductList(BufferedReader in, PrintStream out, PrintStream err, WarehouseType warehouseType) {
        System.out.println("PRODUCT_LIST: Choose the product you want to buy!");
        Warehouse warehouse = new Warehouse(warehouseType);
        int idx = 1;
        for (Product p : warehouse.getProducts()) {
            System.out.printf("%d. %s %-6d", idx, p.getName(), p.getPrice());
            idx += 1;
        }
        return true;
    }
}
