package handmade.test;

import handmade.Book;
import handmade.BookSerializator;

public class SerializationTest {

  public static void main(String[] args) {
    BookSerializator serializator = new BookSerializator();

    Book book = new Book(
        "Преступление и наказание",
        "Достоевский",
        "Трагедия",
        1337
    );

    String serializedBook = serializator.serializeBook(book);
    System.out.println(serializedBook);
  }
}
