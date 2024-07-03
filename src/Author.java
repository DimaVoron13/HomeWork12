import java.util.Objects;

public final class Author {
    private final String authorsName;
    private final String authorsLastName;

    public Author(String authorsName, String authorsLastName) {
        this.authorsName = authorsName;
        this.authorsLastName = authorsLastName;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public String getAuthorsLastName() {
        return authorsLastName;
    }

    public String toString() {
        return authorsName + " " + authorsLastName;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(getAuthorsName(), author.getAuthorsName()) && Objects.equals(getAuthorsLastName(), author.getAuthorsLastName());
    }

    public int hashCode() {
        return Objects.hash(getAuthorsName(), getAuthorsLastName());
    }
}
