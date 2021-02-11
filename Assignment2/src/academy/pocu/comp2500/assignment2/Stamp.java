package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {
    protected String text;

    protected Stamp(Size size, int price, String text) {
        super(price);
        super.size = size;
        super.name = "Stamp";
        this.text = text;
    }
}
