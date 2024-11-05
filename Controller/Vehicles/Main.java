package Vehicles;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    Bicycle bike = new Bicycle();
    // Vechicle vechicle = new Vechicle();

    car.go();
    bike.stop();

    System.out.println(car.doors);
    System.out.println(bike.pedals);
  }
}
