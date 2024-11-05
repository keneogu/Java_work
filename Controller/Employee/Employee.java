package Employee;

import CondoSale.CisUtility;

public class Employee {
  private int hoursWorked;
  private int hoursWorkedOvertime;
  private int hoursWorkedRegular;
  private int skillLevel;
  private double payRate;
  private double totalRegularPay;
  private double totalOvertimePay;
  private double deductionTotal;
  private double deductionMedical;
  private double deductionDental;
  private double deductionLTDisability;
  private double deductionPension;

  public static final double INSURANCE_MEDICAL = 32.5;
  public static final double INSURANCE_DENTAL = 20.0;
  public static final double INSURANCE_LT_DISABILITY = 10.0;
  public static final double PAY_LEVEL_1 = 17.0;
  public static final double PAY_LEVEL_2 = 20.0;
  public static final double PAY_LEVEL_3 = 22.0;
  public static final double PENSION_DEDUCTION_RATE = 0.03;
  public static final double OVERTIME_PREMIUM_RATE = 1.5;
  public static final int REGULAR_HOURS_PER_WEEK = 40;

  public Employee() {

  }

  public Employee(int hoursWorked, int skillLevel) {
    this.hoursWorked = hoursWorked;
    this.skillLevel = skillLevel;

    processPay();
    processDeductions();
  }

  public void getInformation() {
    hoursWorked = CisUtility.getInputInt("How many hours worked");
    skillLevel = CisUtility.getInputInt("What is the skill level");

    processPay();
    processDeductions();

  }

  public void processDeductions() {
    if (skillLevel > 1) {
      boolean wantsMedicalInsurance = CisUtility.getInputBoolean("Medical Insurance");
      boolean wantsDentalInsurance = CisUtility.getInputBoolean("Dental Insurance");
      boolean wantsLTDisabilityInsurance = CisUtility.getInputBoolean("Long term disability insurance");

      if (wantsMedicalInsurance) {
        deductionMedical = INSURANCE_MEDICAL;

      }
      if (wantsDentalInsurance) {
        deductionDental = INSURANCE_DENTAL;
      }
      if (wantsLTDisabilityInsurance) {
        deductionLTDisability = INSURANCE_LT_DISABILITY;
      }
      if (skillLevel == 3) {
        boolean wantsPension = CisUtility.getInputBoolean("Pension Plan");
        if (wantsPension) {
          deductionPension = (totalRegularPay + totalOvertimePay) * PENSION_DEDUCTION_RATE;
        }
      }
      deductionTotal = deductionMedical + deductionDental + deductionLTDisability + deductionPension;
    }

  }

  public void processPay() {
    if (hoursWorked > REGULAR_HOURS_PER_WEEK) {
      hoursWorkedOvertime = hoursWorked - REGULAR_HOURS_PER_WEEK;
      hoursWorkedRegular = REGULAR_HOURS_PER_WEEK;

    } else {
      hoursWorkedOvertime = 0;
      hoursWorkedRegular = hoursWorked;

    }
    switch (skillLevel) {
      case 1:
        payRate = PAY_LEVEL_1;
        break;
      case 2:
        payRate = PAY_LEVEL_2;
        break;
      case 3:
        payRate = PAY_LEVEL_3;
        break;
    }
    totalRegularPay = hoursWorkedRegular * payRate;
    totalOvertimePay = hoursWorkedOvertime * payRate * OVERTIME_PREMIUM_RATE;

  }

  public void display() {
    System.out.println(toString());
  }

  public String toString() {
    return "Employee Details\n"
      + "Hours Worked: " + hoursWorked + "\n"
      + "Hourly payrate: " + CisUtility.toCurrency(payRate) + "\n"
      + "Ragular pay: " + CisUtility.toCurrency(totalRegularPay) + "\n"
      + "overtime pay: " + CisUtility.toCurrency(totalOvertimePay) + "\n"
      + "Total pay: " + CisUtility.toCurrency(totalRegularPay + totalOvertimePay) + "\n"
      + "Deductions: \n"
      + "Medical: " + CisUtility.toCurrency(deductionMedical) + "\n"
      + "Dental: " + CisUtility.toCurrency(deductionDental) + "\n"
      + "LTDisability: " + CisUtility.toCurrency(deductionLTDisability) + "\n"
      + "Pension Plan: " + CisUtility.toCurrency(deductionPension) + "\n"
      + "Net Pay: " + CisUtility.toCurrency(totalRegularPay + totalOvertimePay - deductionTotal) + "\n";
  }

}
