import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamMain {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("resource/input.txt");
        byte[] inputBytes = new byte[10];

        boolean readAtOnce = false;
        while(!readAtOnce || inputStream.available() > 0) {
            int readBytes = inputStream.read(inputBytes);
            readAtOnce = true;

            System.out.println("Read " + readBytes + " bytes");
            System.out.println("Bytes:");
            System.out.println(Arrays.toString(inputBytes));
        }

        inputStream.close();

        // char  0 ... 65535
        // byte  -128 ... 127
        // ascii symbol 0 ... 256

        /*int inputByte = inputStream.read();
        char inputCharacter = (char) inputByte;

        System.out.println(inputCharacter + " " + inputByte);*/
    }
}
