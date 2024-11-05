public class Second {
  public static void main(String[] args) {

    int total = getTotal(5, 4);
    int multilpy = getTotal(2, 3);

    double addedAns = total + multilpy;
    System.out.println(addedAns);
  }

  private static int getTotal(int x, int y) {
    return x + y;
  }

  private static int getMultiply(int x, int y) {
    return x * y;
  }

}
