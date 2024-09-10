import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyCatalog.fillMyCatalog();
        while(true) {
            System.out.println("Выберите пункт меню");
            System.out.println("1 - Каталог");
            System.out.println("2 - Корзина");
            System.out.println("4 - Настройки");
            System.out.println();
            System.out.println("0 - Выход");
            int userInput = Integer.parseInt(UserActions.userAction());
            if(userInput==0){
                break;
            }else if(userInput == 4){
Settings.setFilterAndComparator();
            }
            else {
            Action action = new Action();
            action.makeChoice(userInput);
            Thread.sleep(500);
            }
        }
    }
}
