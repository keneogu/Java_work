package Business;

public class Order {

  public static final String BUSINESS_NAME = "Bernadette's Flowers";
  public static final String BUSINESS_ADDRESS = "25 Hopeton Road\nStratford, PE\nC1B 1H6";
  public static final double TAX_RATE = 0.15;
  public static final double COST_WELCOME_BABY_BOY = 90;
  public static final double COST_WELCOME_BABY_GIRL = 85;
  public static final double COST_VERY_SPECIAL_DELIVERY = 100;

  public static final double COST_STUFFED_ANIMAL_SMALL = 10;
  public static final double COST_STUFFED_ANIMAL_MEDIUM = 20;
  public static final double COST_STUFFED_ANIMAL_LARGE = 30;

  public static final int NONE_STUFFED_ANIMAL = 0;
  public static final int STUFFED_ANIMAL_SMALL = 1;
  public static final int STUFFED_ANIMAL_MEDIUM = 2;
  public static final int STUFFED_ANIMAL_LARGE = 3;

  private int numberWelcomeBabyBoy;
  private int numberWelcomeBabyGirl;
  private int numberVerySpecialDelivery;
  private int stuffedAnimalOption;

  // Constructor with all parameters
  public Order(int numberWelcomeBabyBoy, int numberWelcomeBabyGirl, int numberVerySpecialDelivery, int stuffedAnimalOption) {
    if (numberWelcomeBabyBoy < 0) {
      this.numberWelcomeBabyBoy = 0;
      System.out.println("Error: Quantity for 'Welcome Baby Boy' bouquet cannot be negative. Setting it to 0.");
    } else {
      this.numberWelcomeBabyBoy = numberWelcomeBabyBoy;
    }

    if (numberWelcomeBabyGirl < 0) {
      this.numberWelcomeBabyGirl = 0;
      System.out.println("Error: Quantity for 'Welcome Baby Girl' bouquet cannot be negative. Setting it to 0.");
    } else {
      this.numberWelcomeBabyGirl = numberWelcomeBabyGirl;
    }

    if (numberVerySpecialDelivery < 0) {
      this.numberVerySpecialDelivery = 0;
      System.out.println("Error: Quantity for 'Very Special Delivery' bouquet cannot be negative. Setting it to 0.");
    } else {
      this.numberVerySpecialDelivery = numberVerySpecialDelivery;
    }

    this.stuffedAnimalOption = stuffedAnimalOption;
  }

  // Default constructor
  public Order() {
  }

  // Static method to show business information
  public static void showBusinessInformation() {
    System.out.println(BUSINESS_NAME);
    System.out.println(BUSINESS_ADDRESS);
    System.out.println(""); // Empty line after display
  }

  // Getters and setters
  public int getNumberWelcomeBabyBoy() {
    return numberWelcomeBabyBoy;
  }

  public int getNumberWelcomeBabyGirl() {
    return numberWelcomeBabyGirl;
  }

  public int getNumberVerySpecialDelivery() {
    return numberVerySpecialDelivery;
  }

  public int getStuffedAnimalOption() {
    return stuffedAnimalOption;
  }

  public void setNumberWelcomeBabyBoy(int numberWelcomeBabyBoy) {
    this.numberWelcomeBabyBoy = numberWelcomeBabyBoy;
  }

  public void setNumberWelcomeBabyGirl(int numberWelcomeBabyGirl) {
    this.numberWelcomeBabyGirl = numberWelcomeBabyGirl;
  }

  public void setNumberVerySpecialDelivery(int numberVerySpecialDelivery) {
    this.numberVerySpecialDelivery = numberVerySpecialDelivery;
  }

  public void setStuffedAnimalOption(int stuffedAnimalOption) {
    this.stuffedAnimalOption = stuffedAnimalOption;
  }

  // Input user data
  public void getData() {

    numberWelcomeBabyBoy = CisUtility.getInputInt("How many 'Welcome Baby Boy' bouquets?");

    numberWelcomeBabyGirl = CisUtility.getInputInt("How many 'Welcome Baby Girl' bouquets?");

    numberVerySpecialDelivery = CisUtility.getInputInt("How many 'Very Special Delivery' bouquets?");

    stuffedAnimalOption = CisUtility.getInputInt("Stuffed animal options (0=None 1=Small 2=Medium 3=Large):");

    System.out.println("");
  }

  // Get stuffed animal description
  private String getStuffedAnimalDescription() {

    String stuffedAnimal = "";

    switch (stuffedAnimalOption) {
      case NONE_STUFFED_ANIMAL:
        stuffedAnimal = "None";
      case STUFFED_ANIMAL_SMALL:
        stuffedAnimal = "Small";
      case STUFFED_ANIMAL_MEDIUM:
        stuffedAnimal = "Medium";
      case STUFFED_ANIMAL_LARGE:
        stuffedAnimal = "Large";
      default:
        stuffedAnimal = "Invalid Input";
    }

    return stuffedAnimal;
  }

  // Calculate the subtotal
  public double getSubtotal() {
    double subtotal = numberWelcomeBabyBoy * COST_WELCOME_BABY_BOY
        + numberWelcomeBabyGirl * COST_WELCOME_BABY_GIRL
        + numberVerySpecialDelivery * COST_VERY_SPECIAL_DELIVERY;

    if (stuffedAnimalOption == STUFFED_ANIMAL_SMALL) {
      subtotal += COST_STUFFED_ANIMAL_SMALL;
    } else if (stuffedAnimalOption == STUFFED_ANIMAL_MEDIUM) {
      subtotal += COST_STUFFED_ANIMAL_MEDIUM;
    } else if (stuffedAnimalOption == STUFFED_ANIMAL_LARGE) {
      subtotal += COST_STUFFED_ANIMAL_LARGE;
    }

    return subtotal;
  }

  public double getTax() {
    return TAX_RATE * getSubtotal();
  }

  public double getTotal() {
    return getSubtotal() + getTax();
  }

  // Display order summary
  public void display() {
    System.out.println(toString());
  }

  // Convert order to string
  @Override
  public String toString() {
    String output = "Order Summary";
    if (getSubtotal() >= 500) {
      output += " (Large Order!)";
    }
    output += "\nNumber of Welcome Baby Boy bouquets: " + numberWelcomeBabyBoy;
    output += "\nNumber of Welcome Baby Girl bouquets: " + numberWelcomeBabyGirl;
    output += "\nNumber of Very Special Delivery bouquets: " + numberVerySpecialDelivery;
    output += "\nStuffed Animal: " + getStuffedAnimalDescription();
    output += "\nSubtotal:  $" + getSubtotal();
    output += "\nTax: $" + getTax();
    output += "\nTotal Cost:  $" + getTotal();
    return output;
  }

}
