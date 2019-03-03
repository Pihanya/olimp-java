package handmade;

// Класс книги, на котором мы будем тестировать самописную сериализацию
public class Book {

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

  public int getPages() {
    return pages;
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
