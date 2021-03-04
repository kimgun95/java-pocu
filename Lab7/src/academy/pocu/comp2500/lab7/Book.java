package academy.pocu.comp2500.lab7;

public final class Book {
    private final String title;
    private final Author author;
    private final int publishedYear;
    private final Genre genre;

    public Book(String title, Author author, int publishedYear, Genre genre) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
        this.genre = genre;
    }
    public String toString() {
        return String.format("%s [%s]", this.title, this.author.toString());
    }
    public boolean equals(Book book) {
        if (this == book) {
            return true;
        }
        if (book == null || !(book instanceof Book)
                || this.hashCode() != book.hashCode()) {
            return false;
        }
        if (!this.title.equals(book.title)
                || !this.author.equals(book.author)
                || this.publishedYear != book.publishedYear
                || this.genre != book.genre) {
            return false;
        }
        return true;
    }
    public int hashCode() {
        int hash = 17;
        hash = hash * 31 + this.title.hashCode();
        hash = hash * 31 + this.author.hashCode();
        hash = hash * 31 + this.publishedYear;
        hash = hash * 31 + this.genre.hashCode();

        return hash;
    }
}
