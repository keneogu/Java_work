package ScholarShip;

public class Scholarship {

  private double high_school_gpa;
  private int extracurricular_activities;
  private int service_activities;
  private String message;

  public void getInformation() {
    high_school_gpa = CisUtility.getInputDouble("Enter gpa");
    extracurricular_activities = CisUtility.getInputInt("Number of extracurricular activities");
    service_activities = CisUtility.getInputInt("Number of service activities");

    scholarship_candidate();
  }

  public void scholarship_candidate() {
    int total_activities = extracurricular_activities + service_activities;
    if (high_school_gpa < 0 || high_school_gpa > 4.0 || extracurricular_activities < 0 || service_activities < 0) {
      message = "Error: Invalid input. Please enter a valid GPA between 0 and 4.0, and non-negative values for activities.";
    } else {
      if (high_school_gpa == 4.0) {
        message = "Scholarship candidate";
      } else if (high_school_gpa >= 3.8 && extracurricular_activities >= 1 && service_activities >= 1) {
        message = "Scholarship candidate";
      } else if (high_school_gpa >= 3.4 && extracurricular_activities >= 1) {
        message = "Scholarship candidate";
      } else if (high_school_gpa >= 3.4 && total_activities >= 3) {
        message = "Scholarship candidate";
      } else if (high_school_gpa >= 3.0 && extracurricular_activities >= 2 && service_activities >= 3) {
        message = "Scholarship candidate";
      } else {
        message = "Not a candidate";
      }
    }
  }

  public void display(){
    System.out.println(toString());
  }

  public String toString() {
    String output;

    output = "\nYour GPA is: " + high_school_gpa + "\n"
              + "Extracurricular activities: " + extracurricular_activities + "\n"
              + "Service activities: " + service_activities + "\n"
              + "Scholarship candidate: " + message;
    return output;
  }
}
