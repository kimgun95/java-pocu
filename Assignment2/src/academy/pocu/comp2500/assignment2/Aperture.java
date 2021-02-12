package academy.pocu.comp2500.assignment2;

public class Aperture {
    private String imageAperture;
    private String textAperture;

    public Aperture() {
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
        this.imageAperture = imageAperture;
    }
    public void setTextAperture(String textAperture) {
        this.textAperture = textAperture;
    }
}
