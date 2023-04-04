public class Book {
    private String title;
    private Author author;
    private int year;
    protected int rating;
    private String text;


    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = 3;
        this.text = "Harry ";

    }
    public int up() {
        if (rating < 5) {
            rating++;
        }
        return rating;
    }
    public int down() {
        if (rating > 0) {
            rating--;
        }
        return rating;
    }
    public String append(String moreText) {
        text += moreText;
        return text;
    }
    public String toString() {
        return "Название: " + title + "\n" +
                "Автор: " + author + "\n" +
                "Год написания: " + year + "\n" +
                "Рейтинг: " + rating + "\n" +
                "Описание: " + text;
    }
}