package academy.pocu.comp2500.assignment2;

public enum StampColor {
    RED(new Color(0xFF, 0, 0)),
    BLUE(new Color(0, 0, 0xFF)),
    GREEN(new Color(0, 0x80, 0)),
    ;

    private final Color color;

    public Color getColor() {
        return color;
    }
    StampColor(Color color) {
        this.color = color;
    }
}
