import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BookTest {

    private Book book;

    @BeforeAll
    static void startTest() {
        System.out.println("Начало тестирования...");
    }

    @BeforeEach
    void bookInit() {
        book = new Book("Title", new Author("Alex", "Pushkin", 200), 2022);
    }

    @AfterEach
    void endTest() {
        System.out.println("Тестирование завершено!");
    }

    @DisplayName("Тестирование метода up()")
    @Test
    void up() {
        Assertions.assertEquals(4, book.up());
    }

    @DisplayName("Тестирование метода append()")
    @ParameterizedTest
    @CsvSource(value = {"Potter |Harry Potter"}, delimiter = '|')
    void append(String added, String result) {
        Assertions.assertEquals(result, book.append(added));
    }

    @Test
    @DisplayName("Тестирование метода down()")
    void down() {
        Assertions.assertEquals(2, book.down());
    }

    @ParameterizedTest
    @MethodSource("getArguments")
    void append2(String text, String expected) {
        Assertions.assertEquals(expected, book.append(text));
    }

    private static Stream<Arguments> getArguments() {
        return Stream.of(
                Arguments.of("& Ron", "Harry & Ron"),
                Arguments.of("is Volandemort", "Harry is Volandemort")
        );
    }
}