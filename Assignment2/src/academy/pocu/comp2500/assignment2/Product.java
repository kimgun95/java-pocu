package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class Product {
    protected Color color;
    protected Size size;
    protected int price;
    protected String name;
    protected ShippingMethod shippingMethod;

    private String text = "";
    private String imagePath = "";

    protected Product(Size size, int price) {
        this.size = size;
        this.price = price;
    }
    public Color getColor() {
        return this.color;
    }
    public int getPrice() {
        return this.price;
    }
    public Size getSize() {
        return this.size;
    }
    public ShippingMethod getShippingMethod() {
        return this.shippingMethod;
    }
    public String getName() {
        return this.name;
    }
    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
    public void addText(String text) {
        if (text == null) {
            this.price += 5;
        }
        this.text = text;
    }
    public void addImage(String imagePath) {
        if (text == null) {
            this.price += 5;
        }
        this.imagePath = imagePath;
    }
    public String getText() {
        return this.text;
    }
    public String getImagePath() {
        return this.imagePath;
    }
}
