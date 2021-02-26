package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class ApertureProduct extends Product {
    private ArrayList<Aperture> apertures = new ArrayList<>();
    private Orientation orientation;

    protected ApertureProduct(String name, Color color, ProductSize productSize, int price, ShippingMethod shippingMethod, Orientation orientation) {
        super(name, color, productSize, price, shippingMethod);

        this.orientation = orientation;
    }

    public boolean addAperture(Aperture aperture) {
        if (aperture.getX() < 0 || aperture.getX() + aperture.getWidth() > super.getWidth()) {
            return false;
        }
        if (aperture.getY() < 0 || aperture.getY() + aperture.getHeight() > super.getHeight()) {
            return false;
        }

        apertures.add(aperture);
        super.setPrice(super.getPrice() + 5);
        return true;
    }
    public ArrayList<Aperture> getApertures() {
        return apertures;
    }
    public Orientation getOrientation() {
        return orientation;
    }
}
