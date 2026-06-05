package inheritance;

public class Car extends Vehicle {
    // Constructor for Car
    public Car(int wheelsCount, String model) {
        super(wheelsCount, model);  // Call parent constructor
    }

    void start(){
        System.out.println("Parent super start method");
        super.start();
        System.out.println("Child start method");
        System.out.println(this);
        System.out.println(this.model+ " is starting in child...");
        System.out.println("Final Gear Count is: " + super.gearsCount);
    }
    
    public static void main(String[] args) {
        System.out.println("----------------------------");

        Car carObj = new Car(4, "Santro");
        carObj.start();
        System.out.println("Car model: " + carObj.model);
        System.out.println("Wheels: " + carObj.wheelsCount);

        System.out.println("----------------------------");

        Car carObj2 = new Car(2, "Splendor");
        carObj2.start();
        System.out.println("Car model: " + carObj2.model);
        System.out.println("Wheels: " + carObj2.wheelsCount);

        System.out.println("----------------------------");
    }
}