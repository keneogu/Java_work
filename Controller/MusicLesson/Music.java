package MusicLesson;
// import java.util.Scanner;

public class Music {

  public static void main(String[] args) {
    User Bob = new User();
    User Sue = new User();
    Bob.getInformation();
    Bob.calculate();
    Bob.display();
    Sue.getInformation();
    Sue.calculate();
    Sue.display();
  }
}