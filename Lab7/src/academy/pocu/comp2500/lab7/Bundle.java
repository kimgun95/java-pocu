package academy.pocu.comp2500.lab7;

import java.util.HashSet;

public final class Bundle {
    private final String name;
    private HashSet<Book> books = new HashSet<>();

    public Bundle(String name) {
        this.name = name;
    }
    public boolean add(Book book) {
        if (book == null) {
            return false;
        }
        for (Book b : this.books) {
            if (b.hashCode() == book.hashCode()) {
                return false;
            }
        }
        this.books.add(book);
        return true;
    }
    public boolean remove(Book book) {
        if (book == null) {
            return false;
        }
        for (Book b : this.books) {
            if (b.hashCode() == book.hashCode()) {
                this.books.remove(book);
                return true;
            }
        }
        return false;
    }
    public boolean equals(Bundle bundle) {
        if (this == bundle) {
            return true;
        }
        if (bundle == null || !(bundle instanceof Bundle)
                || this.hashCode() != bundle.hashCode()) {
            return false;
        }
        Bundle bun = (Bundle) bundle;
        if (!this.name.equals(bun.name) || !this.books.equals(bun.books)) {
            return false;
        }
        return true;
    }
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + this.name.hashCode();
        for (Book b : this.books) {
            hash = hash * 31 + b.hashCode();
        }
        return hash;
    }
}
