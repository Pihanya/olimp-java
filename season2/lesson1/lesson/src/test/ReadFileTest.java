package test;

import main.FileUtils;

public class ReadFileTest {
  private static final String FILE_NAME = "text/file.txt";

  public static void main(String[] args) {
    String text = FileUtils.readFile(FILE_NAME);

    if(text == null) {
      System.out.println("Не удалось прочитать файл :(");
    } else {
      System.out.println("Содержимое файла:");
      System.out.print(text);
    }
  }
}
