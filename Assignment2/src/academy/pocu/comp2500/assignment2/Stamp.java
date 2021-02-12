package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class Stamp extends Product {
    private String text;

    public Stamp(StampType stampType, Size size, int price, String text) {
        super(size, price);
        if (stampType == StampType.RED) {
            super.color = new Color(0xFF, 0x00, 0x00);
        } else if (stampType == StampType.BLUE) {
            super.color = new Color(0x00, 0x00, 0xFF);
        } else {
            super.color = new Color(0x00, 0x80, 0x00);
        }
        super.name = "Stamp";
        this.text = text;
    }
}
