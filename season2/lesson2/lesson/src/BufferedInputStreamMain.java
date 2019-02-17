import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class BufferedInputStreamMain {
    public static void main(String[] args) throws IOException {
        InputStream stream = new BufferedInputStream(System.in, 32);
        byte[] bytes = new byte[10];

        stream.read(bytes, 1, 9);
        System.out.println(Arrays.toString(bytes));
    }
}
