package handmade.test;

import handmade.Book;
import handmade.BookSerializator;

public class DeserializationTest {

  public static void main(String[] args) {
    String bookString = "Война и мир,Толстой,Историческое фентези," + Integer.MAX_VALUE + '\n';

    BookSerializator serializator = new BookSerializator();
    Book book = serializator.deserializeBook(bookString);

    System.out.println(book);
  }
}
