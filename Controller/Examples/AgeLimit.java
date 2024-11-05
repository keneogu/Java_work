package Examples;

import java.util.Scanner;

public class AgeLimit {
    private int age;
    private String name;

    AgeLimit(int age, String name) {
//        this.age = age;
//        this.name = name;
        setAge(age);
        setName(name);
    }

    AgeLimit(){

    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void getInformation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Name");
        name = scanner.next();

        System.out.println("Input age");
        age = scanner.nextInt();

        getAgeLimit();
    }

    public void getAgeLimit() {
        if (age < 16 || age >= 70) {
            System.out.println("You're not eligible to drive");
        } else {
            System.out.println("You're eligible to drive");
        }
    }
}
