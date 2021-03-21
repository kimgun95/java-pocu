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
    public int getTotalPrice(PricePolicy pricePolicy) {
        return pricePolicy.getTotalPrice(books);
    }
}