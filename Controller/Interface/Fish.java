package Interface;

public class Fish implements Prey, Predator {
  
  public void flee() {
    System.out.println("This fish is fleeing from a bigger fish");
  }
  public void hunt() {
    System.out.println("This fish is hunting smaller fish");
  }
}
