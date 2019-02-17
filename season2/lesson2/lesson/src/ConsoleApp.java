import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintStream out = new PrintStream(new FileOutputStream("resource/output.txt"));

        // string.split(" ")
        // "abc def".split(" ") == {"abc", "def"}

        // print {} - напечатать что-нибудь
        // println {} - напечатать что-нибудь и перевести строку

        // print Hello
        // println Hello world

        while (true) {
            String line = scanner.nextLine(); // print Hello world
            String[] data = line.split(" "); // { "print", "Hello", "world" }

            String text;
            switch (data[0]) {
                case "print":
                    text = line.substring(data[0].length() + 1); // Hello world
                    out.print(text);
                    break;

                case "println":
                    text = line.substring(data[0].length() + 1); // Hello world\n
                    out.println(text);
                    break;

                case "help":
                    printHelp();
                    break;

                case "quit":
                case "exit":
                case "q":
                    scanner.close();
                    out.close();
                    System.exit(0);

                default:
                    printHelp();
            }
        }
    }

    // scanner.useDelimiter("\|/")
    // abcd\|/efg\|/qwerty\|/2281488
    // scanner.next() - abcd
    // scanner.next() - efg

    private static void printHelp() {
        System.out.println("print {} - print something");
        System.out.println("println {} - print something with line break");
        System.out.println("help - print this message");
        System.out.println("exit - exit from console app");
    }
}
