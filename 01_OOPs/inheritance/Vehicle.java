package inheritance;

public class Vehicle {
    int wheelsCount;
    String model;
    final int gearsCount = 4;
    
    // Constructor
    public Vehicle(int wheelsCount, String model) {
        this.wheelsCount = wheelsCount;
        this.model = model;
    }

    void start(){
        System.out.println(model + " is starting in parent...");
    }
}