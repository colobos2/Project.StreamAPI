import java.util.ArrayList;
import java.util.Scanner;

public class Action {
int input;
static String id;
int quantity;
static int x;
Scanner scanner = new Scanner(System.in);

 static   MyCatalog catalog = new MyCatalog();
  static ArrayList<Product> catalogForUser;
static Cart cart = new Cart();
static ArrayList<Product> cartForUser = cart.productsInCart;

public void showCatalogAndAddItem(){
    catalogForUser = MyCatalog.getPagCatalog(MyCatalog.catalog);
            for (int i = 0; i< catalogForUser.size();i++) {
                System.out.println(catalogForUser.get(i));
            }
        System.out.println();
        PaginationSettings.navigationInfo();
        System.out.println();
            addToCart();
        }



    public void addToCart() {
        while (true) {
            System.out.println("Для выбора товара введите id или нажмите 3 для выхода");
            id = UserActions.userAction();
            if (id.equals("3")) {
                break;
            }
            if (id.equals("N")) {
                PaginationSettings.chooseNextOrPreviousPage();
                showCatalogAndAddItem();
                break;
            }
            if (id.equals("P")) {

            PaginationSettings.chooseNextOrPreviousPage();
            showCatalogAndAddItem();
            break;
        }
                else {
                for (int i = 0; i < catalogForUser.size(); i++) {
                    if (id.equals(catalogForUser.get(i).id)) {
                        cartForUser.add(catalogForUser.get(i));
                        System.out.println("Введите количество товара");
                        quantity = Integer.parseInt(UserActions.userAction());
                        cartForUser.get(x).quantity = quantity;
                        cartForUser.get(x).amount = cartForUser.get(x).quantity * cartForUser.get(x).price;
                        cartForUser.get(x).totalAmount = calculateTotalAmount();
                        x++;
                        System.out.println("Товар добавлен в корзину");
                        System.out.println();
                    }
                }
            }



            }

    }
        int calculateTotalAmount(){
            int result=cartForUser.get(0).amount;
            if(cartForUser.size()>1){
                for(int i=0;i<cartForUser.size()-1;i++){
                    result =cartForUser.get(i).amount+cartForUser.get(i+1).amount;}
                return result;
            }else
                return result;
        }


        public void showCart(){
            System.out.println("Содержимое корзины:");
            if (!cartForUser.isEmpty()){
                for (int i = 0; i< cartForUser.size();i++) {
                    System.out.println(cartForUser.get(i).toStringForCart());

                }
                System.out.println();
                choosePaimentOrReturn();
            }else{
                System.out.println("Ваша корзина пуста");
            }
        }
        void makeChoice(int input){
            this.input=input;
            if (input==1){
                showCatalogAndAddItem();
            }else if(input==2){
                showCart();
            }

        }
        void choosePaimentOrReturn(){
            System.out.println("Выберите пункт меню");
            System.out.println("1 - Перейти к оплате");
            System.out.println("2 - Вернуться в главное меню");
            input= scanner.nextInt();
            if (input==1){
                makePayment();
            }

        }
        private void makePayment(){
            System.out.println("Введите номер карты");
            long cardNumber = scanner.nextLong();

            System.out.println("Оплата прошла успешно");
            System.out.println("Благодарим Вас за покупку!");
        }
    }

