import java.util.ArrayList;
import java.util.Comparator;

public class MyCatalog {
    static ArrayList<Product> catalog = new ArrayList<>();
   static int catalogSize;

  public static ArrayList<Product> fillMyCatalog() {
      catalog.add(new Product("001", "Кирпич", 20, true));
      catalog.add(new Product("002", "Бетон", 2000, true));
      catalog.add(new Product("003", "Смеситель", 3500, true));
      catalog.add(new Product("004", "Телевизор", 40000, true));
      catalog.add(new Product("005", "Телефон", 10000, true));
      catalog.add(new Product("006", "Водонагреватель", 15000, true));
      catalog.add(new Product("007", "Монитор", 6000, true));
      catalog.add(new Product("008", "Кофеварка", 34000, false));
      catalog.add(new Product("009", "Чайник", 3000, false));
      catalog.add(new Product("010", "Клей", 200, false));
      catalog.add(new Product("011", "Скотч", 150, true));
      catalog.add(new Product("012", "Пена монтажная", 300, false));
      catalog.add(new Product("013", "Дверь", 5000, false));
      catalog.add(new Product("014", "Замок", 200, true));
      catalog.add(new Product("015", "Ключ разводной", 300, false));
      catalog.add(new Product("016", "Клавиатура", 2000, true));
      catalog.add(new Product("017", "Ванна стальная", 7000, true));
      catalog.add(new Product("018", "Песок", 50, true));
      catalog.add(new Product("019", "Мышь компьютерная", 500, false));
      catalog.add(new Product("020", "Осушитель воздуха", 15000, false));
      catalog.add(new Product("021", "Гвозди", 5, true));
      getCatalogSize(catalog);

      return catalog;
  }
  public static int getCatalogSize(ArrayList<Product> catalog){
     return catalogSize = catalog.size();
  }


  public static ArrayList<Product> getPagCatalog(ArrayList<Product> catalog){
      int page = PaginationSettings.currentPage;
      int limit = PaginationSettings.qtiyProductsPerPage;
      if(Settings.filterIsOn) {
          ArrayList<Product> newCatalog = new ArrayList<>(catalog.stream().skip(page * limit).limit(limit).sorted(new ProductComparator()).
                 filter(p-> p.available).toList());
         return newCatalog;
     } else{
      ArrayList<Product> newCatalog = new ArrayList<>(catalog.stream().skip(page * limit).limit(limit).toList());
      return newCatalog;}
  }
   }
   class ProductComparator implements Comparator<Product>{

       @Override
       public int compare(Product p1, Product p2) {
           if(Settings.up){
           return p2.price-p1.price;}
           else{
               return p1.price-p2.price;
           }

       }
   }



