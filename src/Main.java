public class Main {
    public static void main(String[] args) {

        Author kafka = new Author("Франц", "Кафка");
        System.out.println("Имя автора - " + kafka.getAuthorsName());
        System.out.println("Фамилия автора - " + kafka.getAuthorsLastName());
        System.out.println();

        Author kizi = new Author("Кен", "Кизи");
        System.out.println("Имя автора - " + kizi.getAuthorsName());
        System.out.println("Фамилия автора - " + kizi.getAuthorsLastName());
        System.out.println();

        Book castle = new Book(kafka, "Замок", 2020);
        System.out.println("Автор - " + kafka.getAuthorsName() + " " + kafka.getAuthorsLastName());
        System.out.println("Название книги - " + castle.getTitle());
        System.out.println("Год публикации - " + castle.getYearOfPublication());
        System.out.println();

        Book oneFlewOverTheCuckoosNest = new Book(kizi, "Над кукушкиным гнездом", 2020);
        System.out.println("Автор - " + kizi.getAuthorsName() + " " + kizi.getAuthorsLastName());
        System.out.println("Название книги - " + oneFlewOverTheCuckoosNest.getTitle());
        System.out.println("Год публикации - " + oneFlewOverTheCuckoosNest.getYearOfPublication());
        System.out.println();

        castle.setYearOfPublication(2021);
        System.out.println("Год публикации - " + castle.getYearOfPublication());
    }
}