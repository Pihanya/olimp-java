package serializable;

import java.io.Serializable;

// Класс, объекты которого мы будем сериализовать/десериализовать силами встроенных механизмов Java
// Стоит заметить, что здесь есть 'implements Serializable'. Это нужно для корректной работы встроенного сериализатора
public class Book implements Serializable {

  private String name;
  private String author;
  private String genre;
  private int pages;

  public Book(String name, String author, String genre, int pages) {
    this.name = name;
    this.author = author;
    this.genre = genre;
    this.pages = pages;
  }

  public String getName() {
    return name;
  }

  public String getAuthor() {
    return author;
  }

  public String getGenre() {
    return genre;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", author='" + author + '\'' +
        ", genre='" + genre + '\'' +
        ", pages=" + pages +
        '}';
  }
}
