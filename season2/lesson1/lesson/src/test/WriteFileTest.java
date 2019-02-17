package test;

import main.FileUtils;

public class WriteFileTest {
  private static final String FILE_NAME = "text/file.txt";
  private static final String TEXT_TO_WRITE = "Hello world1\nHello world2\nHello olimp";

  public static void main(String[] args) {
    boolean success = FileUtils.writeFile(FILE_NAME, TEXT_TO_WRITE);

    if(!success) {
      System.out.println("Не удалось записать в файл " + FILE_NAME);
    } else {
      System.out.println("В файл было записано следующая строка: ");
      System.out.print(FileUtils.readFile(FILE_NAME));
    }
  }
}
