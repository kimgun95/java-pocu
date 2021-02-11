package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class GlossBanner extends Banner {
    public GlossBanner(Size size, int price, Color color, Orientation orientation) {
        super(size, price, color, orientation);
        super.name = "Gloss Banner";
    }
}
