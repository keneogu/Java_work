package PaintCalculator;

import java.util.Scanner;

public class PaintJob {
  private static final double COST_PER_GALLON = 32;
  private static final double COVERAGE = 350;

  public int length;
  public int width;
  public int height;
  private int area;
  private double gallonsNeeded;
  private double cost;

  public void getInformation() {
    Scanner input = new Scanner(System.in);

    System.out.println("Input length: ");
    this.length = input.nextInt();

    System.out.println("Input width: ");
    this.width = input.nextInt();

    System.out.println("Input height: ");
    this.height = input.nextInt();
  }

  public void calculate() {
    calculateArea();
    paintNeeded();
    calculateCost();
  }

  public int calculateArea() {
    return area = 2 * (length * height) + 2 * (width * height);
  }

  public double paintNeeded() {
    return gallonsNeeded = area / COVERAGE;
  }

  public double calculateCost() {
    return cost = gallonsNeeded * COST_PER_GALLON;
  }

  public void display() {
    System.out.println(toString());
  }

  public String toString() {
    return String.format(
      "Total Wall Area: %d square feet\n" +
      "Gallons of Paint Needed: gallons\n" +
      "Total Cost: $",
      calculateArea(), gallonsNeeded, cost
    );
  }
}
