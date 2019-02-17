package main;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    private static final String FILE_PATH = "text/file.txt";

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter(FILE_PATH);
            writer.write("Hello world!");

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
