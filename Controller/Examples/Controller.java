package Examples;

public class Controller {

  public static void main(String[] args) {

//    AgeLimit user1 = new AgeLimit();
//    user1.getInformation();

    AgeLimit user2 = new AgeLimit(15, "james");
    String result = user2.getName();

    System.out.println(result);
//    System.out.println(user2);

  }
}
