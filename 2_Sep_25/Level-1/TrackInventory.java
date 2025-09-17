public class TrackInventory {
    int itemCode;
    String itemName;
    double price;

    public TrackInventory(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        TrackInventory item = new TrackInventory(1001, "Pen", 15.5);
        item.displayDetails();
        System.out.println("Total cost for 10 items: " + item.totalCost(10));
    }
}