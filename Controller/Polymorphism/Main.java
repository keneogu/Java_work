package Polymorphism;

public class Main {
  
  public static void main(String[] args) {
    Car car = new Car();
    Bicycle bicycle = new Bicycle();
    Boat boat = new Boat();

    Vechicle[] racers = {car, bicycle,boat};

    for(Vechicle i :  racers){
      i.go();
    }
  }
}
