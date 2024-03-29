package academy.pocu.comp2500.lab7;

import java.util.LinkedList;

public final class ReadingList {
    private final String name;
    private LinkedList<Book> bookList = new LinkedList<>();

    public ReadingList(String name) {
        this.name = name;
    }
    public void add(Book book) {
        this.bookList.add(book);
    }
    public boolean remove(Book book) {
        if (book == null) {
            return false;
        }
        if (!bookList.contains(book)) {
            return false;
        }
        bookList.remove(book);
        return true;
    }
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        int idx = 1;
        for (Book b : this.bookList) {
            sb.append(idx + ". " + b.toString() + System.lineSeparator());
            idx += 1;
        }
        return sb.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReadingList)
                || this.hashCode() != obj.hashCode()) {
            return false;
        }
        ReadingList readingList = (ReadingList) obj;
        if (!this.name.equals(readingList.name) || this.bookList.size() != readingList.bookList.size()) {
            return false;
        }
        for (int i = 0; i < this.bookList.size(); i++) {
            if (!this.bookList.get(i).equals(readingList.bookList.get(i))) {
                return false;
            }
        }
        return true;
    }
    @Override
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + this.name.hashCode();
        for (Book b : this.bookList) {
            hash = hash * 31 + b.hashCode();
        }
        return hash;
    }
}
