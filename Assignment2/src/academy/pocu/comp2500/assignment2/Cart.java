package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;
    private int totalPrice;

    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }
    public void addProduct(Product product) {
        this.products.add(product);
        totalPrice += product.getPrice();
    }
    public void deleteProduct(Product product) {
        for (Product p : this.products) {
            if (product == p) {
                this.totalPrice -= p.getPrice();
                this.products.remove(p);
            }
        }
    }
    public ArrayList<Product> getProducts() {
        for (Product p : this.products) {
            System.out.println(p.getName());
        }
        return this.products;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
}
