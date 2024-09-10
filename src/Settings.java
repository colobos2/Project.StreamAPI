import java.util.Scanner;

public class Settings {
    static boolean filterIsOn = false;
    static boolean comparatorIsOn = false;
   static boolean up = false;

   static void switchFilter(){
       System.out.println("Отфильтровать по наличию товара?(y/n)");
       String userInput = UserActions.userAction();
       if (userInput.equals("y")){
           filterIsOn = true;
       } else filterIsOn = false;
   }

   static void setFilterAndComparator(){
       switchFilter();
       System.out.println("Отсортировать по возрастанию цены?(y/n)");
      String userInput = UserActions.userAction();
if(userInput.equals("n")){
    up = true;
}
       System.out.println();
    }
}
