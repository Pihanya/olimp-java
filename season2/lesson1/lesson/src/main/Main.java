package main;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File textAbsolute = new File("text/text.txt");
        File textRelative = new File("text/text.txt"); // то же самое
        System.out.println(textAbsolute.getName() + " существует: " + textAbsolute.exists());
        System.out.println(textRelative.getName() + " существует: " + textRelative.exists());

        try {
            System.out.println("Имя файла: " + textAbsolute.getName());
            System.out.println("Абсолютный путь: " + textAbsolute.getAbsolutePath());
            System.out.println("Канонический путь: " + textAbsolute.getCanonicalPath());

            System.out.println("Имя файла: " + textAbsolute.getName());
            System.out.println("Абсолютный путь: " + textAbsolute.getAbsolutePath());
            System.out.println("Канонический путь: " + textAbsolute.getCanonicalPath());
        } catch (IOException ex) {
            System.out.println("Ошибка работы с файлом: " + ex.getMessage());
        }
    }
}
