public class HandleMobile {
    String brand;
    String model;
    double price;

    public HandleMobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        HandleMobile phone = new HandleMobile("Samsung", "Galaxy S21", 69999);
        phone.displayDetails();
    }
}