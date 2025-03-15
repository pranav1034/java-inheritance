// Superclass: Book
class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author (inherits from Book)
class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);  // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();  // Call superclass method
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }

    public static void main(String[] args) {
        Author book1 = new Author("The Blue Umbrella",1974,"Ruskin Bond","Indian author of British descent");

        // Display book and author details
        System.out.println("\nLibrary Book Details:");
        book1.displayInfo();
    }
}