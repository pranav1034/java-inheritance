// Superclass: Transport
class Transport {
    protected String model;
    protected int maxSpeed;

    public Transport(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    void refuel();
}

// Subclass: ElectricTransport
class ElectricTransport extends Transport {
    private int batteryCapacity; // in kWh

    public ElectricTransport(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass: PetrolTransport (Implements Refuelable)
class PetrolTransport extends Transport implements Refuelable {
    public PetrolTransport(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public static void main(String[] args) {
        ElectricTransport electric = new ElectricTransport("MG ZS EV", 200, 100);
        PetrolTransport petrol = new PetrolTransport("AUDI", 240);

        System.out.println("\nTransport Details:");
        electric.displayInfo();
        electric.charge();
        System.out.println();

        petrol.displayInfo();
        petrol.refuel();
    }
}
