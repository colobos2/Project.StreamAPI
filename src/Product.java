public class Product {
    String id;
    String title;
    int price;
    int amount;
    int quantity;
    int totalAmount;
    boolean available;

Product(String id, String title, int price, boolean available){
        this.id = id;
        this.title = title;
        this.price = price;
        this.available = available;

    }


    @Override
    public String toString() {
        return "id: "+id + " " +"Наименование: "+ title +" "+ "Цена: "+ price;
    }

    public String toStringForCart(){
        return "id: "+id + "\n" +"Наименование: "+ title +" "+ "Цена: "+ price+"\n"+
                "Количество: "+quantity+" "+"Сумма: "
                +amount+"\n"+"\n"+"Итоговая стоимость: "+totalAmount;
    }
}
