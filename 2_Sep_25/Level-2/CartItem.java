import java.util.ArrayList;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();
        cart.add(new CartItem("Pen", 10, 2));
        cart.add(new CartItem("Book", 50, 1));

        // Remove item example (remove first item)
        cart.remove(0);

        double totalCost = 0;
        for (CartItem item : cart) {
            totalCost += item.getTotal();
        }
        System.out.println("Total Cart Cost: " + totalCost);
    }
}