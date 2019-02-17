package test;

import main.FileUtils;

public class CreateFilesTest {

  private static final String[] fileName = new String[]{
      "text/text1.txt",
      "text/text2.txt"
  };

  public static void main(String[] args) {
    boolean success = FileUtils.createFiles(fileName);

    if (success) {
      System.out.println("Файлы были успешно созданы");
    }
  }
}
