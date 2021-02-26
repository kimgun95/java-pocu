package academy.pocu.comp2500.assignment2;

import java.awt.*;

public enum BusinessCardColor {
    GRAY(new Color(0xE6, 0xE6, 0xE6)),
    IVORY(new Color(0xFF, 0xFF, 0xF0)),
    WHITE(new Color(0xFF, 0xFF, 0xFF)),
    ;

    private Color color;

    BusinessCardColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return this.color;
    }
}
