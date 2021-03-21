package academy.pocu.comp2500.lab9;

import java.util.ArrayList;
import java.util.HashMap;

public final class DecadeMadness {
    private HashMap<Integer, Integer> eventListAndCount = new HashMap<>();

    public DecadeMadness() {

    }
    public int getTotalPrice(ArrayList<Book> books) {
        double totalPrice = 0;
        for (Book b : books) {
            int year = b.getPublishedYear() / 10;
            if (!eventListAndCount.containsKey(year)) {
                eventListAndCount.put(year ,1);
            } else {
                int value = eventListAndCount.get(year);
                eventListAndCount.put(year, value + 1);
            }
        }
        for (Book b : books) {
            int year = b.getPublishedYear() / 10;
            if (eventListAndCount.get(year) >= 2) {
                totalPrice += ((double) b.getPrice() * 0.8);
            } else {
                totalPrice += (double) b.getPrice();
            }
        }
        return (int) totalPrice;
    }
}
