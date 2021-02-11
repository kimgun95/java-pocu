package academy.pocu.comp2500.assignment2;

import java.awt.*;
import java.util.ArrayList;

public class Banner extends Product {
    protected Orientation orientation;
    protected ArrayList<String> text = new ArrayList<>();

    public Banner(Size size, int price, Color color, Orientation orientation) {
        super(price);
        super.size = size;
        super.color = color;
        this.orientation = orientation;
        super.name = "Banner";
    }
}
