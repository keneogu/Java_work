package test;
import java.util.Random;;

public class User {

  User(){
    Random random = new Random();
    int number = 0;
    roll(random, number);
  }

  void roll(Random random, int number){
    number = random.nextInt(6)+1;
    System.out.println(number);
  }
  
  
}
