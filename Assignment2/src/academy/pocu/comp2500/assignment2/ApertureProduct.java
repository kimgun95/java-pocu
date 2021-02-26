package academy.pocu.comp2500.assignment2;

import java.awt.*;
import java.util.ArrayList;

public class ApertureProduct extends Product {
    private ArrayList<Aperture> apertures = new ArrayList<>();
    private Orientation orientation;

    protected ApertureProduct(String name, Color color, ProductSize productSize, int price, ShippingMethod shippingMethod, Orientation orientation) {
        super(name, color, productSize, price, shippingMethod);

        this.orientation = orientation;
    }
}
