package PaintCalculator;

public class Controller {
  public static void main(String[] args) {
    PaintJob Job = new PaintJob();
    Job.getInformation();
    Job.calculate();
    Job.display();
  }
}
