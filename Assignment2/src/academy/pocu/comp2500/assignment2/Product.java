package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class Product {
    private String name;
    private Color color;
    private ProductSize size;
    private int price;
    private ShippingMethod shippingMethod;

    protected Aperture aperture;

    protected Product(String name, Color color, ProductSize productSize, int price, ShippingMethod shippingMethod) {
        this.name = name;
        this.color = color;
        this.size = productSize;
        this.price = price;
        this.shippingMethod = shippingMethod;
    }
    public Color getColor() {
        return this.color;
    }
    public int getPrice() {
        return this.price;
    }
    public ProductSize getSize() {
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

}
