package academy.pocu.comp2500.assignment2;

public class Aperture extends Product {
    private String imageAperture;
    private String textAperture;

    public Aperture(Size size, int price) {
        super(size, price);
        this.imageAperture = null;
        this.textAperture = null;
    }
    public String getImageAperture() {
        return this.imageAperture;
    }
    public String getTextAperture() {
        return this.textAperture;
    }
    public void setImageAperture(String imageAperture) {
        if (this.imageAperture == null) {
            super.price += 5;
        }
        this.imageAperture = imageAperture;
    }
    public void setTextAperture(String textAperture) {
        if (this.textAperture == null) {
            super.price += 5;
        }
        this.textAperture = textAperture;
    }
}
