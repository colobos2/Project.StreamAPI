public class PaginationSettings {
    static double paginationSize;
    static int qtiyProductsPerPage =10;
   static int currentPage;

  public static  double getPaginationSize(){
        paginationSize = ((double) MyCatalog.catalogSize /10);
        return paginationSize;
    }
    public static void navigationInfo(){
        System.out.println("Страница "+ (currentPage+1) +", "+"всего страниц: " +(int)Math.ceil(getPaginationSize()));
        PaginationSettings.infoNextOrPreviousPage(currentPage,(int)paginationSize);

    }
    static void infoNextOrPreviousPage(int currentPage, int paginationSize){
      if(currentPage>0&&currentPage<paginationSize){
          System.out.println("Предыдущая страница: нажмите P"+ "\t"+"Следующая страница: нажмите N");
      } else
      if(currentPage<=1){
          System.out.println("Следующая страница: нажмите N");
      } else
      if(currentPage >=paginationSize){
          System.out.println("Предыдущая страница: нажмите P");
      }
    }


    static void chooseNextOrPreviousPage(){
      String userChoose = Action.id;
      if(currentPage>=0&&currentPage<=(int)paginationSize){
          if(userChoose.equals("N")){
              currentPage++;
              if(currentPage>(int)paginationSize){
                  currentPage=(int)paginationSize;
              }
          }
      if (userChoose.equals("P")){
          currentPage--;
          if(currentPage<0){
              currentPage=0;
          }
      }
      }
      }
    }

