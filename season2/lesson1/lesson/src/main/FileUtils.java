package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class FileUtils {

    public static boolean createFile(String fileName) {
        Objects.requireNonNull(fileName, "Имя файл не должно равняться null");

        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Файл " + fileName + " уже существует");
            return false;
        }

        try {
            file.createNewFile();
            return true;
        } catch (IOException e) {
            System.out.println("Ошибка работы с файлом: " + e.getMessage());
            return false;
        }
    }

    public static boolean createFiles(String[] fileNames) {
        boolean allCreated = true;
        for (String fileName : fileNames) {
            boolean createSucces = FileUtils.createFile(fileName);

            if (!createSucces) {
                allCreated = false;
            }
        }

        return allCreated;
    }

    public static String readFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            return null;
        }

        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
            return null;
        }

        StringBuilder fileText = new StringBuilder();
        while (scanner.hasNext()) {
            fileText.append(scanner.next());
        }

        return fileText.toString();
    }

    public static boolean writeFile(String fileName, String text) {
        File file = new File(fileName);

        if (!file.exists()) {
            createFile(fileName);
        }

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(text);
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + fileName + " не найден");
            return false;
        }

        return true;
    }

    public static boolean appendFile(String fileName, String text) {
        String fileText = readFile(fileName);
        if (fileText == null) {
            fileText = "";
        }

        return writeFile(fileName, fileText + text);
    }
}
