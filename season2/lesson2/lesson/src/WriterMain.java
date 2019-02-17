import java.io.*;

public class WriterMain {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("resource/output.txt");
        Reader reader = new InputStreamReader(System.in);

        int readInt;
        char readChar;
        while(true) {
            readInt = reader.read();
            if(readInt == -1) {
                break;
            } else if(readInt == '0'){
                break;
            } else {
                readChar = (char) readInt;
                writer.write(readChar);
            }
        }

        reader.close();
        writer.close();
    }
}
