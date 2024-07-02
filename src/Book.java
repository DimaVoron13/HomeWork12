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
}
