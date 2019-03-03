package reflection.test;

import java.lang.reflect.Field;
import reflection.User;

public class ReflectionTest {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    User user = new User("pihanya", "mypassword");

    Field userNameField = User.class.getDeclaredField("userName");
    userNameField.setAccessible(true);
    String userName = (String) userNameField.get(user);

    System.out.println(userName);

    Field passwordField = User.class.getDeclaredField("password");
    passwordField.setAccessible(true);
    passwordField.set(user, "newpassword");

    String password = (String) passwordField.get(user);

    System.out.println(password);
  }
}
