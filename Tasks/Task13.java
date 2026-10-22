// Base class
class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

// Derived class
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);   // Call the parent constructor!
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main class
public class Task13 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, 4);
        myCar.displayDetails();
    }
}