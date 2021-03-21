package academy.pocu.comp2500.lab9;

import java.util.ArrayList;

public final class Cart {
    private ArrayList<Book> books = new ArrayList<>();

    public Book getBookOrNull(int index) {
        if (this.books.size() <= index) {
            return null;
        }

        return this.books.get(index);
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void addBooks(ArrayList<Book> books) {
        for (Book b : books) {
            this.books.add(b);
        }
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean remove(int index) {
        if (this.books.size() <= index) {
            return false;
        }

        this.books.remove(index);

        return true;
    }
    public int getTotalPrice() {
        int sum = 0;

        for (Book book : this.books) {
            sum += book.getPrice();
        }

        return sum;
    }
    public int getTotalPrice(SimplePricing simplePricing) {
        return simplePricing.getTotalPrice(books);
    }
    public int getTotalPrice(BuyOneGetOneFree buyOneGetOneFree) {
        return buyOneGetOneFree.getTotalPrice(books);
    }
    public int getTotalPrice(DecadeMadness decadeMadness) {
        return decadeMadness.getTotalPrice(books);
    }
    public int getTotalPrice(SkyIsTheLimit skyIsTheLimit) {
        return skyIsTheLimit.getTotalPrice(books);
    }
}