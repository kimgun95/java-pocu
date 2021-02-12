package academy.pocu.comp2500.assignment2;

import javax.print.attribute.standard.OrientationRequested;
import java.awt.*;
import java.util.ArrayList;

public class Banner extends Product {
    private Orientation orientation;


    public Banner(BannerType bannerType, Size size, int price, BannerColor bannerColor, Orientation orientation) {
        super(size, price);
        super.aperture = new Aperture();
        this.orientation = orientation;
        if (bannerType == BannerType.GLOSS) {
            super.name = "Gloss Banner";
        } else if (bannerType == BannerType.SCRIM) {
            super.name = "Scrim Banner";
        } else {
            super.name = "Mesh Banner";
        }
        if (bannerColor == BannerColor.BLACK) {
            super.color = new Color(0x00,0x00,0x00);
        } else if (bannerColor == BannerColor.BROWN) {
            super.color = new Color(45, 7, 7, 237);
        } else {
            super.color = new Color(0xFF,0xFF,0x00);
        }
    }
    public Orientation getOrientation() {
        return this.orientation;
    }
}
