import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    double getTotal() {
        return products.stream().mapToDouble(p -> p.price).sum();
    }
}

class Customer2 {
    String name;

    Customer2(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order worth $" + o.getTotal());
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Customer2 c = new Customer2("Alice");
        Order o = new Order();
        o.addProduct(new Product("Laptop", 800));
        o.addProduct(new Product("Mouse", 20));
        c.placeOrder(o);
    }
}
