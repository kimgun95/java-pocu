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
        if (books.contains(book)) {
            return false;
        }
        this.books.add(book);
        return true;
    }
    public boolean remove(Book book) {
        if (book == null) {
            return false;
        }
        if (!books.contains(book)) {
            return false;
        }
        books.remove(book);
        return true;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Bundle)
                || this.hashCode() != obj.hashCode()) {
            return false;
        }
        Bundle bundle = (Bundle) obj;
        if (!this.name.equals(bundle.name) || !this.books.equals(bundle.books)) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + this.name.hashCode();
        for (Book b : this.books) {
            hash = hash * 31 + b.hashCode();
        }
        return hash;
    }
}
