// Superclass: RestaurantStaff
class RestaurantStaff {
    protected String name;
    protected int id;

    public RestaurantStaff(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties(); // Abstract method to be implemented by subclasses
}

// Subclass: Chef
class Chef extends RestaurantStaff implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is the chef whose6 speciality is " + specialty + " dishes.");
    }
}

// Subclass: Waiter (inherits from RestaurantStaff & implements Worker)
class Waiter extends RestaurantStaff implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving " + tablesAssigned + " tables.");
    }

    public static void main(String[] args) {

        // Creating a Chef
        Chef chef = new Chef("Pranav", 101, "Chinese Cuisine");
        System.out.println("\nStaff Info:");
        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        // Creating a Waiter
        Waiter waiter = new Waiter("Alice", 202, 5);
        System.out.println("Staff Info:");
        waiter.displayInfo();
        waiter.performDuties();
    }
}
