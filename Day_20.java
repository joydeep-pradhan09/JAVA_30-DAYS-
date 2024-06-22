// Define the Vehicle interface
interface Vehicle {
    void start();  // Method to start the vehicle
    void stop();   // Method to stop the vehicle
}
// Implementing the Vehicle interface for a Car
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started. Ready to go!");
        // Additional logic to start the car can be added here
    }
    @Override
    public void stop() {
        System.out.println("Car stopped.");
        // Additional logic to stop the car can be added here
    }
}
// Implementing the Vehicle interface for a Bike
class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike started. Enjoy your ride!");
        // Additional logic to start the bike can be added here
    }
    @Override
    public void stop() {
        System.out.println("Bike stopped.");
        // Additional logic to stop the bike can be added here
    }
}
// Main class Day_20 to test the Vehicle interface and its implementations
public class Day_20 {
    public static void main(String[] args) {
        // Creating instances of Car and Bike
        Car myCar = new Car();
        Bike myBike = new Bike();

        // Starting and stopping the car
        myCar.start();
        myCar.stop();

        System.out.println(); // Blank line for separation

        // Starting and stopping the bike
        myBike.start();
        myBike.stop();
    }
}