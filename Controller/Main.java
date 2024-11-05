import java.util.Scanner;

public class Main {
    private static final String BUSINESS_NAME = "Bernadette's Flowers";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Welcome_Baby_Boy = 90, Welcome_Baby_Girl = 85, Very_Special_Delivery = 100;
        float taxRate = 0.15f;

        String address = "25 Hopeton Road\nStratford, PE\nC1B 1H6";

        System.out.println(BUSINESS_NAME + "\n" + address + "\n");

        // System.out.println("How many 'Welcome Baby Boy' bouquets?");
        // int babyBoyInput = input.nextInt();

        // System.out.println("How many 'Welcome Baby Girl' bouquets?");
        // int babyGirlInput = input.nextInt();

        // System.out.println("How many 'Very Special Delivery' bouquets?");
        // int specialDeliveryInput = input.nextInt();

        int babyBoyInput = getQuantity(input, Welcome_Baby_Boy);
        int babyGirlInput = getQuantity(input, Welcome_Baby_Girl);
        int specialDeliveryInput = getQuantity(input, Very_Special_Delivery);

        System.out.println("");
        
        double subTotal = (babyBoyInput * Welcome_Baby_Boy) + (babyGirlInput * Welcome_Baby_Girl) + (specialDeliveryInput * Very_Special_Delivery);

        double tax = subTotal * taxRate;
        double totalCost = subTotal + tax;

        System.out.println("Order Summary");

        printSummary(babyBoyInput, babyGirlInput, specialDeliveryInput, subTotal, tax, totalCost);
        // System.out.println("Number of Welcome Baby Boy bouquets: " + babyBoyInput);
        // System.out.println("Number of Welcome Baby Girl bouquets: " + babyGirlInput);
        // System.out.println("Number of Very Special Delivery bouquets: " + specialDeliveryInput);
        // System.out.println("Subtotal: $" + subTotal);
        // System.out.println("Tax: $" + String.format("%.2f", tax));
        // System.out.println("Total Cost: $" + String.format("%.2f", totalCost));

        input.close();
    }

    private static int getQuantity(Scanner input, int bouquents) {
        System.out.println("How many " + bouquents +  " bouquets?");
        return input.nextInt();
    }

    private static void printSummary(int boyQty, int girlQty, int specialQty, double subTotal, double tax, double total) {
        System.out.println("\nOrder Summary");
        System.out.printf("Welcome Baby Boy: %d\nWelcome Baby Girl: %d\nVery Special Delivery: %d\n", boyQty, girlQty,
            specialQty);
        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal Cost: $%.2f\n", subTotal, tax, total);
      }
}