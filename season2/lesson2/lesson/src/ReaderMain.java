import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderMain {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("resource/input.txt");

        char readChar;
        int readInt;
        while(true) {
            readInt = reader.read();
            if(readInt == -1) {
                break;
            } else {
                readChar = (char) readInt;
                System.out.print(readChar + " ");
            }
        }

        reader.close();
    }
}
