package Business;

import java.util.Scanner;

public class MainOrder {
   public static final String BUSINESS_NAME = "Bernadette's Flowers";
  public static final String BUSINESS_ADDRESS = "25 Hopeton Road\nStratford, PE\nC1B 1H6\n";

  public int babyBoyBouquets;
  public int babyGirlBouquets;
  public int verySpecialDelivery;

  public static final double BABY_BOY_PRICE = 90,
      BABY_GIRL_PRICE = 85,
      SPECIAL_DELIVERY_PRICE = 100,
      TAX_RATE = 0.15;

  // business information
  public static void showBusinessInformation() {
    //Show the business information
    System.out.println(BUSINESS_NAME);
    System.out.println(BUSINESS_ADDRESS);
    System.out.println(""); //Empty line after display

  }
  // getters
  public int getBabyBoyBouquets() {
    return babyBoyBouquets;
  }

  public int getBabyGirlBouquets() {
    return babyGirlBouquets;
  }

  public int getVerySpecialDelivery() {
    return verySpecialDelivery;
  }

  // setters
  public void setBabyBoyBouquets(int babyBoyBouquets) {
    this.babyBoyBouquets = babyBoyBouquets;
  }

  public void setBabyGirlBouquets(int babyGirlBouquets) {
    this.babyGirlBouquets = babyGirlBouquets;
  }

  public void setVerySpecialDelivery(int verySpecialDelivery) {
    this.verySpecialDelivery = verySpecialDelivery;
  }

   // get user data
   public void getData() {
    Scanner input = new Scanner(System.in);

    System.out.println("How many 'Welcome Baby Boy' bouquets?");
    if(input.nextInt() < 0) {
      setBabyBoyBouquets(0);
      System.out.println("");
    }else {
      setBabyBoyBouquets(input.nextInt());
    }

    System.out.println("How many 'Welcome Baby Girl' bouquets?");
    setBabyGirlBouquets(input.nextInt());

    System.out.println("How many 'Very Special Delivery' bouquets?");
    setVerySpecialDelivery(input.nextInt());
  }

   // subtotal method
   public double subtotal() {
    double subTotal = (getBabyBoyBouquets() * BABY_BOY_PRICE) + (getBabyGirlBouquets() * BABY_GIRL_PRICE) + (getVerySpecialDelivery() * SPECIAL_DELIVERY_PRICE);
    return subTotal;
  }
  // getTax method
  public double getTax() {
    return subtotal() * TAX_RATE;
  }
  // getTotal method
  public double getTotal() {
    return subtotal() + getTax();
  }

  public String toString() {
    return "Order Summary\n" +
               "Number of Welcome Baby Boy bouquets: " + babyBoyBouquets + "\n" +
               "Number of Welcome Baby Boy bouquets: " + babyGirlBouquets + "\n" +
               "Number of Very Special Delivery bouquets: " + verySpecialDelivery + "\n" +
               "Subtotal: $" + subtotal() + "\n" +
               "Tax: $" + getTax() + "\n" +
               "Total Cost: $" + getTotal() + "\n";
  }

  public void display(){
    System.out.println(toString());
  }
}
