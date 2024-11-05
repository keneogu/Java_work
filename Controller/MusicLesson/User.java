package MusicLesson;

import java.util.Scanner;

public class User {

  private static final int COST_PER_HOUR_PER_KID = 10;
  private static final int COST_TO_RENT_ONE_GUITAR = 5;
  private static final int COST_TO_RENT_ONE_KEYBOARD = 7;

  public String name;
  public int numberOfKids;
  public int numberOfGuitars;
  public int numberOfKeyboards;
  public double numberOfHours;
  public double cost;

  public void getInformation() {
    Scanner input = new Scanner(System.in);

    // System.out.println("Input Name: ");
    // this.name = input.nextLine();

    System.out.println("Input Number of Kids: ");
    this.numberOfKids = input.nextInt();

    System.out.println("Number of Guitars ");
    this.numberOfGuitars = input.nextInt();

    System.out.println("Number of Keyboards ");
    this.numberOfKeyboards = input.nextInt();

    System.out.println("Number of Hours ");
    this.numberOfHours = input.nextDouble();
  }

  public double calculate() {
    double lessonCost = this.numberOfKids * COST_PER_HOUR_PER_KID * this.numberOfHours;
    double guitarRentCost = this.numberOfGuitars * COST_TO_RENT_ONE_GUITAR;
    double keyboardRentCost = this.numberOfKeyboards * COST_TO_RENT_ONE_KEYBOARD;

    cost = lessonCost + guitarRentCost + keyboardRentCost;
    return cost;
  }

  public void display() {
    System.out.println(toString());
  }

  public String toString() {
    return String.format(
      "Music Lesson Purchase Details:\n" +
          "Name: %s\n" +
          "Number of kids: %d\n" +
          "Number of guitars: %d\n" +
          "Number of keyboards: %d\n" +
          "Number of hours: \n" +
          this.name + " Cost: $",
      this.name,
      this.numberOfKids,
      this.numberOfGuitars,
      this.numberOfKeyboards,
      this.numberOfHours,
      cost
    );
  }
}
