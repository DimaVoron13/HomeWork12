import java.util.Objects;

public class Book {
    private final Author authorName;
    private final String title;
    private int yearOfPublication;

    public Book(Author authorName, String nameBook, int yearOfPublication) {
        this.authorName = authorName;
        this.title = nameBook;
        this.yearOfPublication = yearOfPublication;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return authorName + " " + title + " " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getYearOfPublication() == book.getYearOfPublication() && Objects.equals(getAuthorName(), book.getAuthorName()) && Objects.equals(getTitle(), book.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthorName(), getTitle(), getYearOfPublication());
    }
}
