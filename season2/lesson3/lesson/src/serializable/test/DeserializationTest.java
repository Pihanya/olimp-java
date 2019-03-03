package serializable.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import serializable.Book;
import utils.FileUtils;

public class DeserializationTest {

  private static final String FILE_NAME = "serialization_books.txt";

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    FileUtils.createFile(FILE_NAME);

    ObjectInputStream inputStream =
        new ObjectInputStream(new FileInputStream(FILE_NAME));

    Book book = (Book) inputStream.readObject();

    System.out.println(book);
  }
}
