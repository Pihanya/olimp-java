package serializable.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import serializable.Book;
import utils.FileUtils;

public class SerializationTest {

  private static final String FILE_NAME = "serialization_books.txt";

  public static void main(String[] args) throws IOException {
    FileUtils.createFile(FILE_NAME);

    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME));

    Book book = new Book(
        "Преступление и наказание",
        "Достоевский",
        "Трагедия",
        1337
    );

    outputStream.writeObject(book);

    outputStream.flush();
    outputStream.close();
  }
}
