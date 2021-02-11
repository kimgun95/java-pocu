package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class RedStamp extends Stamp {
    public RedStamp(Size size, int price, String text) {
        super(size, price, text);
        super.color = new Color(0xFF, 0x00, 0x00);
    }
}
