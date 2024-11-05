package Business;

public class Controller {
  public static void main(String[] args) {

    System.out.println(Order.BUSINESS_NAME);
    System.out.println(Order.BUSINESS_ADDRESS);

    // Order.showBusinessInformation();

    Order order = new Order();
    order.getData();
    order.display();
  }
}
