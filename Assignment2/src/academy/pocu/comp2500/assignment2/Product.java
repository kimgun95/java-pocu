package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class Product {
    protected Color color;
    protected Size size;
    protected int price;
    protected String name;

    protected Product(int price) {
        this.price = price;
    }
    public Color getColor() {
        return this.color;
    }
    public int getPrice() {
        return this.price;
    }

}
