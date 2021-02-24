package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    private String text;
    private StampColor stampColor;
    private StampSize stampSize;

    public Stamp(StampColor stampColor, StampSize stampSize, String text, ShippingMethod shippingMethod) {
        super("Stamp", stampColor.getColor(), stampSize.getProductSize(), stampSize.getPrice(), shippingMethod);
        this.text = text;
        this.stampColor = stampColor;
        this.stampSize = stampSize;
    }
    public String getText() {
        return this.text;
    }
    public StampColor getStampColor() {
        return this.stampColor;
    }
    public StampSize getStampSize() {
        return this.stampSize;
    }
}
