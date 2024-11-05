package test;

public class Main {
  
  public static void main(String[] args) {
  //  User user = new User();
  // Pizza pizza = new Pizza("crust","tomato", "mozzerela", "pepperoni");
    // Food[] refrigerator = new Food[3];

    Garage garage = new Garage();

    Car car1 = new Car("BMW");
    Car car2 = new Car("Tesla");
    garage.park(car1);
    garage.park(car2);


    // Food food1 = new Food("pizza");
    // Food food2 = new Food("hamburger");
    // Food food3 = new Food("hotdog");

    // Food[] refrigerator = {food1,food2,food3};

    // refrigerator[0] = food1;
    // refrigerator[1] = food2;
    // refrigerator[2] = food3;

    // System.out.println(refrigerator[0].name);
    // System.out.println(refrigerator[1].name);
    // System.out.println(refrigerator[2].name);
  }
}
