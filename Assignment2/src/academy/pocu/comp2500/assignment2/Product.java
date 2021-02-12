package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class Product {
    protected Color color;
    protected Size size;
    protected int price;
    protected String name;
    protected ShippingMethod shippingMethod;

    protected ImageAperture imageAperture;
    protected TextAperture textAperture;

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
    public void addText(TextAperture text) {
        if (this.textAperture == null) {
            this.price += 5;
        }
        this.textAperture = text;
    }
    public void addImage(ImageAperture imagePath) {
        if (this.imageAperture == null) {
            this.price += 5;
        }
        this.imageAperture = imagePath;
    }
    public TextAperture getText() {
        return this.textAperture;
    }
    public ImageAperture getImagePath() {
        return this.imageAperture;
    }
}
