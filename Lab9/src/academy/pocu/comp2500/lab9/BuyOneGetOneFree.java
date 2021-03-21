package academy.pocu.comp2500.lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

public final class BuyOneGetOneFree {
    private HashSet<UUID> skus;
    private HashMap<UUID, Integer> eventListAndCount = new HashMap<>();
    private HashMap<UUID, Integer> eventListPrice = new HashMap<>();

    public BuyOneGetOneFree(HashSet<UUID> skus) {
        this.skus = skus;
    }
    public int getTotalPrice(ArrayList<Book> books) {
        int totalPrice = 0;
        for (Book b : books) {
            UUID bSku = b.getSku();
            if (skus.contains(bSku)) {
                if (!eventListAndCount.containsKey(bSku)) {
                    eventListAndCount.put(bSku, 1);
                } else {
                    int value = eventListAndCount.get(bSku);
                    eventListAndCount.put(bSku, value + 1);
                }
            }
            totalPrice += b.getPrice();
        }
        double freePrice = 0;
        for (UUID sku : eventListAndCount.keySet()) {
            for (Book b : books) {
                if (sku == b.getSku()) {
                    eventListPrice.put(sku, b.getPrice());
                    break;
                }
            }
            freePrice += (double) eventListPrice.get(sku) * (double) (eventListAndCount.get(sku) / 2);
        }
        return (int) ((double) totalPrice - freePrice);
    }
}
