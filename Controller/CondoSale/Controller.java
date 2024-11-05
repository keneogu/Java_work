package CondoSale;

public class Controller {
  
  public static void main(String[] args) {

    System.out.println("Welcome to the CIS Condo Sales ("+ CisUtility.getTodayString("yyyy-MM-dd")+")");

//    System.out.println(1.toString());

    // CondoSale sales = new CondoSale();
    // System.out.println(sales.PRICE_GARAGE);

    CondoSale condoSale = new CondoSale();

    condoSale.getInformation();

    //client class has a menu which allows user to update a condo

    // condoSale.getInformation();

    System.out.println(condoSale.isHasGarage());

    condoSale.display();
  }

}
