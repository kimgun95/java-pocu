package academy.pocu.comp2500.assignment2;

public class ImageAperture extends Aperture {
    private String imagepath;

    public ImageAperture(int x, int y, int width, int height, String imagepath) {
        super(x, y, width, height);

        this.imagepath = imagepath;
    }
    public String getImagepath() {
        return this.imagepath;
    }
}
