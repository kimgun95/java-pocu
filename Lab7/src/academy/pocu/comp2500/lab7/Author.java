package academy.pocu.comp2500.lab7;

public final class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString() {
        return String.format("%s %s", this.firstName, this.lastName);
    }
    public boolean equals(Author author) {
        if (this == author) {
            return true;
        }
        if (author == null || !(author instanceof Author)
                || this.hashCode() != author.hashCode()) {
            return false;
        }
        return this.firstName.equals(author.firstName) && this.lastName.equals(author.lastName);
    }
    public int hashCode() {
        return this.firstName.hashCode() * 31 + this.lastName.hashCode();
    }
}
