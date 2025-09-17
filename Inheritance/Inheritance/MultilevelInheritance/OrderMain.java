package IntroductionOfInheritance.MultilevelInheritance;

public class OrderMain {
    public static void main(String[] args) {
        Order order = new Order("O101", "2025-09-01");
        ShippedOrder shipped = new ShippedOrder("O101", "2025-09-01", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("O101", "2025-09-01", "TRK12345", "2025-09-05");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}

