// Base class: Course
class Course {
    protected String courseName;
    protected int duration; // weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse (extends Course)
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call superclass constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Call superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse (extends OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Discount percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call superclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo(); // Call superclass method
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        // Basic course
        Course basicCourse = new Course("Core Java", 12);
        System.out.println("\nBasic Course Details:");
        basicCourse.displayCourseInfo();
        System.out.println();

        // Online course
        OnlineCourse onlineCourse = new OnlineCourse("Java Development", 8, "Udemy", true);
        System.out.println("Online Course Details:");
        onlineCourse.displayCourseInfo();
        System.out.println();

        // Paid online course
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Intro to AI", 6, "Coursera", true, 1000, 20);
        System.out.println("Paid Online Course Details:");
        paidCourse.displayCourseInfo();
    }
}
