package academy.pocu.comp2500.lab9;

import java.util.ArrayList;

public abstract class PricePolicy {
    public abstract int getTotalPrice(ArrayList<Book> books);
}
