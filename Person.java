// Superclass: Person
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void displayRole() {
        System.out.println("Principal");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Teaches: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        // Creating a Teacher
        Teacher teacher = new Teacher("Ayesha", 39, "Physics");
        System.out.println("\nPerson Info:");
        teacher.displayInfo();
        teacher.displayRole();
        System.out.println();

        // Creating a Student
        Student student = new Student("Pranav", 18, "12th Grade");
        System.out.println("Person Info:");
        student.displayInfo();
        student.displayRole();
        System.out.println();

        // Creating a Staff Member
        Staff staff = new Staff("Ayush", 38, "Transportation");
        System.out.println("Person Info:");
        staff.displayInfo();
        staff.displayRole();
    }
}
