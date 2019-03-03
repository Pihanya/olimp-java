package serializable.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import serializable.User;
import utils.FileUtils;

public class UserSerializationTest {

  private static final String FILE_NAME = "user.txt";

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    FileUtils.createFile(FILE_NAME);

    User user = new User("pihanya", "mypassword");

    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
    outputStream.writeObject(user);
    outputStream.close();

    User deserializedUser;
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME));
    deserializedUser = (User) inputStream.readObject();

    System.out.println(deserializedUser);
  }
}
