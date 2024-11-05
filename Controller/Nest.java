import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }

  class ChildClass {
    int y = 5;
    public int myInnerMethod() {
      return x + y;
    }
  }
}

public class Nest {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.ChildClass myInner = myOuter.new ChildClass();
    System.out.println(myInner.myInnerMethod());

            ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });

        numbers.set(2, Integer.valueOf(30));
        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers.toString());
        System.out.println(numbers.size());
        System.out.println(numbers.contains(Integer.valueOf(20)));

         HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        examScore.put("Math", 75);
        examScore.put("Eng", 90);
        examScore.put("Bio", 80);

        System.out.println(examScore.toString());

        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();

        ArrayList<String> drinkList = new ArrayList<String>();
        drinkList.add("soda");
        drinkList.add("coffee");
        drinkList.add("tea");

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("floor");
        bakeryList.add("butter");

        groceryList.add(drinkList);
        groceryList.add(bakeryList);
        
        // String[] cars = {"ford", "nissan", "bmw", "benz"};
        // cars[0] = "Mustang";
        System.out.println(groceryList.get(0).get(0));
  }
}
