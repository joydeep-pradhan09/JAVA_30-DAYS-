// Define the Vehicle interface
interface Vehicle {
    void start();  // Method to start the vehicle
    void stop();   // Method to stop the vehicle
}
// Implementing the Vehicle interface for a Bus
class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bus started. All aboard!");
        // Additional logic to start the bus can be added here
    }

    @Override
    public void stop() {
        System.out.println("Bus stopped. End of the route.");
        // Additional logic to stop the bus can be added here
    }
}
// Main class to test the Bus class implementing Vehicle interface
public class Day_21 {
    public static void main(String[] args) {
        // Creating an instance of Bus
        Bus myBus = new Bus();

        // Starting and stopping the bus
        myBus.start();
        myBus.stop();
    }
}