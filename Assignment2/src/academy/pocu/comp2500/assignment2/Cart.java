package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products = new ArrayList<>();

    public Cart() {

    }
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public boolean deleteProduct(Product product) {
        return products.remove(product);
    }
    public ArrayList<Product> getProducts() {
        return this.products;
    }
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product p : this.products) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }
}
