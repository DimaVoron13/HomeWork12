public class Book {
    private final String author;
    private final String nameBook;
    private int yearOfPublication;

    public Book(String author, String nameBook, int yearOfPublication) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
