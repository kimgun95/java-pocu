package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class GreenStamp extends Stamp {
    public GreenStamp(Size size, int price, String text) {
        super(size, price, text);
        super.color = new Color(0x00, 0x80, 0x00);
    }
}
