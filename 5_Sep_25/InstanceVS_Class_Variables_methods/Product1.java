public class Product1 {
    private String productName;
    private double price;

    // Class variable
    private static int totalProducts = 0;

    // Constructor
    public Product1(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increase count when new product is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
