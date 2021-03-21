package academy.pocu.comp2500.lab9;

import java.util.ArrayList;
import java.util.Collections;

public final class SkyIsTheLimit {
    private int price;

    public SkyIsTheLimit(int price) {
        this.price = price;
    }
    public int getTotalPrice(ArrayList<Book> books) {
        int totalPrice = 0;
        for (Book b : books) {
            totalPrice += b.getPrice();
        }
        if (books.size() >= 5 && totalPrice >= price) {
            ArrayList<Integer> priceList = new ArrayList<>();
            double discountPrice = 0;
            for (Book b : books) {
                priceList.add(b.getPrice());
            }
            Collections.sort(priceList, (s1, s2) -> s2 - s1);
            int idx = 0;
            for (int p : priceList) {
                if (idx <= 1) {
                    discountPrice += (double) p * 0.5;
                    idx += 1;
                } else {
                    discountPrice += (double) p;
                }
            }
            return (int) discountPrice;
        }
        return totalPrice;
    }
}
