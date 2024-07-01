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
}
