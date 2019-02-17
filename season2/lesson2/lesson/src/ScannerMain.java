import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        // a b c d e
        System.out.println(scanner.next()); // a
        System.out.println(scanner.next()); // b
        System.out.println(scanner.next()); // c
        System.out.println(scanner.next()); // d
        System.out.println(scanner.next()); // e

        scanner.useDelimiter("\n");

        // a b c d e
        // f g h i j
        //
        System.out.println(scanner.next()); // a b c d e
        System.out.println(scanner.next()); // f g h i j

        scanner.close();
    }
}
