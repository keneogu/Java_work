import java.util.Scanner;

public class Concert {

  private static final double ORCHESTRA_PRICE = 25.00;
  private static final double MAIN_FlOOR = 30.00;
  private static final double BALCONY = 15.00;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("number of Orchestra Seats: ");
    int orchestra = scanner.nextInt();

    System.out.println("number of Main floor Seats: ");
    int main_floor = scanner.nextInt();

    System.out.println("number of Balcony Seats: ");
    int balcony = scanner.nextInt();

    double totalCost = calculateCost(orchestra, main_floor, balcony);

    int totalInput = orchestra + main_floor + balcony;

    double averageCost = calculateAverage(totalInput, totalCost);

    System.out.println("Total Cost of seats: $" + totalCost);
    System.out.println("Average Cost of seats: $" + averageCost);

    scanner.close();
  }

  private static double calculateCost(int x, int y, int z) {
    double total_orchestra = x * ORCHESTRA_PRICE;
    double total_main_floor = y * MAIN_FlOOR;
    double total_balcony = z * BALCONY;
    return total_orchestra + total_main_floor + total_balcony;
  }

  private static double calculateAverage(int a, double b) {
    return b / a;
  }
}
