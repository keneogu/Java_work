public class Car {
    // Instance variable
    String model;
    int year;
    
    // Constructor
    public Car(String model, int year) {
        this.model = model; // 'this.model' refers to the instance variable
        this.year = year;   // 'this.year' refers to the instance variable
    }
    
    public void displayInfo() {
        // Local variable
        String info = "Model: " + model + ", Year: " + year;
        System.out.println(info);  // 'info' is a local variable
    }
    
    public void changeModel(String newModel) {
        // Local variable
        String previousModel = model;
        this.model = newModel;  // 'this.model' refers to the instance variable
        System.out.println("Model changed from " + previousModel + " to " + this.model);
    }
    
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car("Toyota", 2020);
        
        // Access instance variable and local variable
        myCar.displayInfo();
        myCar.changeModel("Honda");
        myCar.displayInfo();
    }
}