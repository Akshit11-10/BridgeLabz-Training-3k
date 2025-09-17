package IntroductionOfInheritance.MultilevelInheritance;

public class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order " + orderId + " has been shipped with Tracking No: " + trackingNumber;
    }
}

