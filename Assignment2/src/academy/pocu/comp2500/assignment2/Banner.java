package academy.pocu.comp2500.assignment2;

import javax.print.attribute.standard.OrientationRequested;
import java.awt.*;
import java.util.ArrayList;

public class Banner extends Product {
    private Orientation orientation;
    private String text = new String();
    private String imagePath = new String();

    public Banner(BannerType bannerType, Size size, int price, Color color, Orientation orientation) {
        super(size, price);
        super.color = color;
        this.orientation = orientation;
        if (bannerType == BannerType.GLOSS) {
            super.name = "Gloss Banner";
        } else if (bannerType == BannerType.SCRIM) {
            super.name = "Scrim Banner";
        } else {
            super.name = "Mesh Banner";
        }
    }
    public Orientation getOrientation() {
        return this.orientation;
    }
    public void addText(String text) {
        this.text = text;
        super.price += 5;
    }
    public void addImage(String imagePath) {
        this.imagePath = imagePath;
        super.price += 5;
    }
    public String getText() {
        return this.text;
    }
    public String getImagePath() {
        return this.imagePath;
    }
}
