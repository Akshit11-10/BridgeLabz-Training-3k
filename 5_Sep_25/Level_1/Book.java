public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this("Unknown", "Unknown", 0.0); // constructor chaining
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters for the attributes
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
