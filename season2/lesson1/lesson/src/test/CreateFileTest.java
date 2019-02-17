package test;

import main.FileUtils;

public class CreateFileTest {

  private static final String FILE_NAME = "text/file.txt";

  public static void main(String[] args) {
    boolean success = FileUtils.createFile(FILE_NAME);

    if(success) {
      System.out.println("Файл был успешно создан!");
    }
  }
}
