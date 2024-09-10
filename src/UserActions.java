import java.util.Scanner;

public class UserActions {
    static Scanner scanner;
  static String userInput;
    static String userAction(){
        scanner = new Scanner(System.in);
        userInput = scanner.next();
        return userInput;
    }

}
