import java.time.LocalDate;

public class Author {
    public String name;
    public String surname;
    public int bookNumber;

    public Author(String name, String surname, int bookNumber) {
        this.name = name;
        this.surname = surname;
        this.bookNumber = bookNumber;
    }

    public String toString() {
        return name + " " + surname;
    }

    public Book newBook(String title) {
        return new Book(title, this, LocalDate.now().getYear());
    }
}