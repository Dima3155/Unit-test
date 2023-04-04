import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Author author = new Author("Joanne", "Rowling", 500);
        Book book = new Book("Harry Potter and the Philosopher`s Stone", author, 1997);
        System.out.println(book);
        System.out.println(book.append("Escaping from his\n" +
                "unbearable Muggle guardians to Hogwarts"));
        System.out.println();
        while (true) {
            System.out.println("Оцените, пожалуйста, нашу книгу");
            System.out.println("Если вам понравилась наша книга-введите 1");
            System.out.println("Если не понравилась-введите 2");
            System.out.println("Для подтверждения вашей оценки и завершения программы введите end");
            String feedback = scanner.nextLine();
            if (feedback.equals("end")) {
                System.out.println("Спасибо за ваш отзыв!\n" +
                        "Рейтинг этой книги: " + book.rating + "\n" +
                        "Программа завершена");
                break;
            }
            int choice = Integer.parseInt(feedback);
            switch (choice) {
                case 1:
                    book.up();
                    System.out.println();
                    continue;
                case 2:
                    book.down();
                    System.out.println();
                    continue;
                default:
                    System.out.println("Такой операции не существует");
                    System.out.println();
            }
        }
        System.out.println();
        System.out.println(author.newBook("Фантастические твари"));
    }
}