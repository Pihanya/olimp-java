package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    private static final String FILE_NAME = "text/file.txt";

    public static void main(String[] args) {
        File dataFile = new File(FILE_NAME);

        try {
            Scanner scanner = new Scanner(dataFile);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
