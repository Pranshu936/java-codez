// Interface
interface Printable {
    void printDetails();
}

// Abstract Class
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void displayInfo();

    void start() {
        System.out.println("Starting the " + brand + " vehicle.");
    }
}

// Concrete Classes
class Car extends Vehicle implements Printable {
    private int numberOfSeats;

    public Car(String brand, int numberOfSeats) {
        super(brand);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    void displayInfo() {
        System.out.println("Car brand: " + brand);
        System.out.println("Number of seats: " + numberOfSeats);
    }

    // Method Overriding
    @Override
    void start() {
        System.out.println("Starting the " + brand + " car.");
    }

    // Method Overloading
    void start(String mode) {
        System.out.println("Starting the " + brand + " car in " + mode + " mode.");
    }

    // Interface Method Implementation
    @Override
    public void printDetails() {
        System.out.println("Printing car details - Brand: " + brand + ", Seats: " + numberOfSeats);
    }
}

class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String brand, String type) {
        super(brand);
        this.type = type;
    }

    @Override
    void displayInfo() {
        System.out.println("Motorcycle brand: " + brand);
        System.out.println("Type: " + type);
    }
}

// Main Class
public class Vehicleinfo{
    public static void main(String[] args) {
        // Using dynamic method dispatch and method overriding
        Vehicle vehicle1 = new Car("Toyota", 5);
        Vehicle vehicle2 = new Motorcycle("Honda", "Sport");

        vehicle1.start(); // Calls overridden method in Car class
        vehicle2.start(); // Calls inherited method in Vehicle class

        // Using method overloading
        Car car = new Car("Ford", 4);
        car.start("Eco"); // Calls overloaded method in Car class

        // Using abstract class method implementation
        vehicle1.displayInfo();
        vehicle2.displayInfo();

        // Using interface method implementation
        if (vehicle1 instanceof Printable) {
            Printable printableVehicle = (Printable) vehicle1;
            printableVehicle.printDetails();
        }
    }
}
