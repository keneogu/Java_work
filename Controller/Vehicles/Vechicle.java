package Vehicles;

public abstract class Vechicle {
  double speed;
  abstract void go();
  void stop() {
    System.out.println("This vechicle is stopped");
  }
}
