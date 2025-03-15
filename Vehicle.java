// Superclass Vehicle
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle info (overridden in subclasses)
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    private int seatCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Car, Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double loadCapacity;

    // Constructor
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Truck, Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private int seatCapacity;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle, Seat capacity: "+seatCapacity);
    }

    public static void main(String[] args) {

        Vehicle myCar = new Car(200, "Petrol", 5);
        Vehicle myTruck = new Truck(120, "Diesel", 10.5);
        Vehicle myMotorcycle = new Motorcycle(180, "Petrol", 2);

        // Storing different vehicles in an array (Demonstrating polymorphism)
        Vehicle[] vehicles = { myCar, myTruck, myMotorcycle };

        // Displaying details using polymorphism
        System.out.println("\nVehicle Information:");
        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}
