package CondoSale;

import CondoSale.CisUtility;

/**
 * Represents a condo sale
 * 
 * @author BJM
 * @since 20241021
 */
public class CondoSale {

  public static final double PRICE_PARK_VIEW = 150000;
  public static final double PRICE_GOLF_COURSE_VIEW = 170000;
  public static final double PRICE_LAKE_VIEW = 210000;
  public static final double PRICE_GARAGE = 5000;
  public static final double PRICE_PARKING = 1000;

  public static final int TYPE_PARK_VIEW = 1;
  public static final int TYPE_GOLF_COURSE_VIEW = 2;
  public static final int TYPE_LAKE_VIEW = 3;

  private double price;
  private int viewType;
  private boolean hasGarage;
  private boolean hasParking;

  public CondoSale() {
  }

  public CondoSale(int viewType, boolean hasGarage, boolean hasParking) {
    this.viewType = viewType;
    this.hasGarage = hasGarage;
    this.hasParking = hasParking;
    calculatePrice();
  }

  public void getInformation() {
    viewType = CisUtility.getInputInt("Choose view type:\n1 for park view \n2 for golf course view \n3 for lake view");
    hasGarage = CisUtility.getInputBoolean("Has garage?");
    hasParking = CisUtility.getInputBoolean("Has parking?");
    calculatePrice();
  }

  /**
   * Calculate the price of the condo
   *
   * @return the price
   * @author CIS1201
   * @since 20241021
   */
  public double calculatePrice() {
    // reset the price to 0
    price = 0;

    if (viewType == TYPE_PARK_VIEW) {
      price += PRICE_PARK_VIEW;
    } else if (viewType == TYPE_GOLF_COURSE_VIEW) {
      price += PRICE_GOLF_COURSE_VIEW;
    } else if (viewType == TYPE_LAKE_VIEW) {
      price += PRICE_LAKE_VIEW;
    }

    // adjust based on the garage option
    if (hasGarage) {
      price += PRICE_GARAGE;
    }

    if (hasParking) {
      price += PRICE_PARKING;
    }
    return price;
  }

  public double getPrice() {
    return price;
  }

  public int getViewType() {
    return viewType;
  }

  public void setViewType(int viewType) {
    this.viewType = viewType;
     calculatePrice();
  }

  public boolean isHasGarage() {
    return hasGarage;
  }

  public void setHasGarage(boolean hasGarage) {
    this.hasGarage = hasGarage;
     calculatePrice();
  }

  public boolean isHasParking() {
    return hasParking;
  }

  public void setHasParking(boolean hasParking) {
    this.hasParking = hasParking;
     calculatePrice();
  }

  public void display() {
    System.out.println(toString());
  }

  public String toString() {

    String viewTypeDescription = "";

    switch (viewType) {
      case TYPE_PARK_VIEW:
        viewTypeDescription = "Park View";
        break;
      case TYPE_GOLF_COURSE_VIEW:
        viewTypeDescription = "Golf Course View";
        break;
      case TYPE_LAKE_VIEW:
        viewTypeDescription = "Lake View";
        break;
      default:
        viewTypeDescription = "Invalid view type";
    }

    String hasGarageDescription = "No";
    if (hasGarage) {
        hasGarageDescription = "Yes";
    }

    String hasParkingDescription = "No";
    if (hasParking) {
        hasParkingDescription = "Yes";
    }

    String output = "Condo Sale\n" +
      "View Type: " + viewTypeDescription + "\n" +
      "Garage: " + hasGarageDescription + "\n" +
      "Parking: " + hasParkingDescription + "\n" +
      "Cost: " + CisUtility.toCurrency(price);
    return output;
  }
}
