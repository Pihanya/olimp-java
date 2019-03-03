package handmade;

public interface StringBookSerializator {

  /**
   * Сериализовать переданную книгу
   *
   * @param book книга, которую нужно сериализовать
   * @return строка, в которой хранится сериализованная книга
   * @throws NullPointerException если переданная книга имееет значение {@code null}
   */
  String serializeBook(Book book);

  /**
   * Десериализовать книгу
   *
   * @param bookString строка, в которой хранится сериализованная книга
   * @return объект книги, получившийся в результате десериализации книги из {@code bookString}
   */
  Book deserializeBook(String bookString);

}