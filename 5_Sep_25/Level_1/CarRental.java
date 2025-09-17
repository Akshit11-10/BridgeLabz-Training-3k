public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    private static final double DAILY_RATE = 50.0; // Example rate

    // Default constructor
    public CarRental() {
        this("Unknown", "Standard", 1);
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    // Copy constructor
    public CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.totalCost = other.totalCost;
    }

    // Encapsulated calculation logic
    private double calculateCost() {
        return rentalDays * DAILY_RATE;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
