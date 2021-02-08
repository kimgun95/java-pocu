package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Menu {
    protected static int PRICE;

    protected Menu(int price) {
        PRICE = price;
    }
    public int getPrice() {
        return PRICE;
    }
}
