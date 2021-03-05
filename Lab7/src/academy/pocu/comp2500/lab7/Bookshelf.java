package academy.pocu.comp2500.lab7;

import java.util.ArrayList;

public final class Bookshelf {
    private final int maxBookCount;
    private ArrayList<Book> books = new ArrayList<>();

    public Bookshelf(int maxBookCount) {
        this.maxBookCount = maxBookCount;
    }
    public boolean add(Book book) {
        if (book == null || this.books.size() == maxBookCount) {
            return false;
        }
        this.books.add(book);
        return true;
    }
    public boolean remove(Book book) {
        if (book == null) {
            return false;
        }
        if (!this.books.contains(book)) {
            return false;
        }
        this.books.remove(book);
        return true;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }
//    @Override
//    public int hashCode() {
//        return this.getClass().hashCode() * 31;
//    }
}
