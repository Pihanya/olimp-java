package handmade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import utils.FileUtils;

// Будем записывать наши книги в таком формате (CSV): name,author,genre,pages Например:
// Война и мир,Толстой,роман-эпопея,1274
// Преступление и наказание,Достоевский,социально-философский, роман,500
public class BookSerializator implements StringBookSerializator {

  private final String FILE_NAME = "books.txt";

  /**
   * Сериализовать переданную книгу
   *
   * @param book книга, которую нужно сериализовать
   * @return строка, в которой хранится сериализованная книга
   * @throws RuntimeException в случае, если произошла ошиба с записью объекта в файл
   * @throws NullPointerException если переданная книга имееет значение {@code null}
   */
  public String serializeBook(Book book) {
    Objects.requireNonNull(book, "Book should not be null");

    FileUtils.createFile(FILE_NAME);

    // Объявляем PrintWriter, который будет писать в файл и через запятую записываем поля переданной книги
    try (PrintWriter printWriter = new PrintWriter(new File(FILE_NAME))) {
      printWriter.print(book.getName() + ',');
      printWriter.print(book.getAuthor() + ',');
      printWriter.print(book.getGenre() + ',');
      printWriter.println(book.getPages());

    } catch (FileNotFoundException ex) {
      // Делаем заглушку для отлавливаемого исключения
      throw new RuntimeException(ex);
    }

    return FileUtils.readFile(FILE_NAME);
  }


  /**
   * Десериализовать книгу
   *
   * @param bookString строка, в которой хранится сериализованная книга
   * @return объект книги, получившийся в результате десериализации книги из {@code bookString}
   */
  public Book deserializeBook(String bookString) {
    // Убираем пробельные символы и символы перевода строки с концов строки
    bookString = bookString.trim();

    // Будем читать книгу из переданной строки через запятую
    Scanner scanner = new Scanner(bookString);
    scanner.useDelimiter(",");

    // Читаем поля книги из строки в следующем порядке:
    // name,author,genre,pages
    String name = scanner.next();
    String author = scanner.next();
    String genre = scanner.next();
    int pages = scanner.nextInt();

    return new Book(
        name,
        author,
        genre,
        pages
    );
  }
}
