// Employee superclass
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details (Overridden in subclasses)
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Manager subclass
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Overriding displayDetails()
    @Override
    public void displayDetails() {
        super.displayDetails(); //calling parent class method
        System.out.println("Role: Manager, Team Size: " + teamSize); //overriding
    }
}

// Subclass: Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails()
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Programming Language: " + programmingLanguage);

    }
}

// Intern subclass
class Intern extends Employee {

    // Constructor
    public Intern(String name, int id, double salary) {
        super(name, id, salary);
    }

    // Overriding displayDetails()
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
    }

    public static void main(String[] args) {
        // Creating objects of different employee types
        Employee manager = new Manager("Pranav", 101, 80000, 5);
        Employee developer = new Developer("Abhay", 102, 60000, "Java");
        Employee intern = new Intern("Nikhil", 103, 20000);

        // Demonstrating polymorphism
        System.out.println("\nEmployee Details:");
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}