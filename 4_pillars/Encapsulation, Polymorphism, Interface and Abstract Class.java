
public class OOP_Java_Solutions {

    public static void main(String[] args) {
        System.out.println("=== Employee Management System ===");
        EmployeeDemo.run();
        System.out.println();

        System.out.println("=== E-Commerce Platform ===");
        ECommerceDemo.run();
        System.out.println();

        System.out.println("=== Vehicle Rental System ===");
        VehicleRentalDemo.run();
        System.out.println();

        System.out.println("=== Banking System ===");
        BankingDemo.run();
        System.out.println();

        System.out.println("=== Library Management System ===");
        LibraryDemo.run();
        System.out.println();

        System.out.println("=== Online Food Delivery System ===");
        FoodDeliveryDemo.run();
        System.out.println();

        System.out.println("=== Hospital Patient Management ===");
        HospitalDemo.run();
        System.out.println();

        System.out.println("=== Ride-Hailing Application ===");
        RideHailingDemo.run();
        System.out.println();
    }

    // 1. Employee Management System
    static class EmployeeDemo {
        static abstract class Employee {
            private String employeeId;
            private String name;
            private double baseSalary;

            public Employee(String employeeId, String name, double baseSalary) {
                this.employeeId = employeeId;
                this.name = name;
                this.baseSalary = baseSalary;
            }

            public String getEmployeeId() { return employeeId; }
            public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public double getBaseSalary() { return baseSalary; }
            public void setBaseSalary(double baseSalary) {
                if (baseSalary < 0) throw new IllegalArgumentException("Salary cannot be negative");
                this.baseSalary = baseSalary;
            }

            public void displayDetails() {
                System.out.printf("ID: %s, Name: %s, Base Salary: %.2f\n", employeeId, name, baseSalary);
            }

            public abstract double calculateSalary();
        }

        interface Department {
            void assignDepartment(String dept);
            String getDepartmentDetails();
        }

        static class FullTimeEmployee extends Employee implements Department {
            private double bonus;
            private String department;

            public FullTimeEmployee(String id, String name, double baseSalary, double bonus) {
                super(id, name, baseSalary);
                this.bonus = bonus;
            }

            public double getBonus() { return bonus; }
            public void setBonus(double bonus) { this.bonus = bonus; }

            @Override
            public double calculateSalary() {
                return getBaseSalary() + bonus;
            }

            @Override
            public void assignDepartment(String dept) { this.department = dept; }

            @Override
            public String getDepartmentDetails() { return department == null ? "Unassigned" : department; }
        }

        static class PartTimeEmployee extends Employee implements Department {
            private double hoursWorked;
            private double hourlyRate;
            private String department;

            public PartTimeEmployee(String id, String name, double hourlyRate, double hoursWorked) {
                super(id, name, 0.0);
                this.hourlyRate = hourlyRate;
                this.hoursWorked = hoursWorked;
            }

            public double getHoursWorked() { return hoursWorked; }
            public void setHoursWorked(double hoursWorked) { this.hoursWorked = hoursWorked; }

            @Override
            public double calculateSalary() {
                return hourlyRate * hoursWorked;
            }

            @Override
            public void assignDepartment(String dept) { this.department = dept; }

            @Override
            public String getDepartmentDetails() { return department == null ? "Unassigned" : department; }
        }

        public static void run() {
            Employee[] employees = new Employee[] {
                new FullTimeEmployee("F001", "Alice", 50000, 5000),
                new PartTimeEmployee("P001", "Bob", 200, 80)
            };

            for (Employee e : employees) {
                if (e instanceof Department) ((Department) e).assignDepartment("General");
                e.displayDetails();
                System.out.printf("Department: %s, Salary: %.2f\n", ((Department)e).getDepartmentDetails(), e.calculateSalary());
            }
        }
    }

    // 2. E-Commerce Platform
    static class ECommerceDemo {
        static abstract class Product {
            private String productId;
            private String name;
            private double price;

            public Product(String productId, String name, double price) {
                this.productId = productId;
                this.name = name;
                setPrice(price);
            }

            public String getProductId() { return productId; }
            public void setProductId(String productId) { this.productId = productId; }

            public String getName() { return name; }
            public void setName(String name) { this.name = name; }

            public double getPrice() { return price; }
            public void setPrice(double price) {
                if (price < 0) throw new IllegalArgumentException("Price cannot be negative");
                this.price = price;
            }

            public abstract double calculateDiscount();
        }

        interface Taxable {
            double calculateTax();
            String getTaxDetails();
        }

        static class Electronics extends Product implements Taxable {
            public Electronics(String id, String name, double price) { super(id, name, price); }
            @Override public double calculateDiscount() { return getPrice() * 0.10; }
            @Override public double calculateTax() { return getPrice() * 0.18; }
            @Override public String getTaxDetails() { return "GST 18%"; }
        }

        static class Clothing extends Product implements Taxable {
            public Clothing(String id, String name, double price) { super(id, name, price); }
            @Override public double calculateDiscount() { return getPrice() * 0.20; }
            @Override public double calculateTax() { return getPrice() * 0.05; }
            @Override public String getTaxDetails() { return "GST 5%"; }
        }

        static class Groceries extends Product {
            public Groceries(String id, String name, double price) { super(id, name, price); }
            @Override public double calculateDiscount() { return 0; }
        }

        public static void run() {
            Product[] products = new Product[] {
                new Electronics("E001","Laptop",70000),
                new Clothing("C001","T-Shirt",800),
                new Groceries("G001","Rice",60)
            };

            for (Product p: products) {
                double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
                double discount = p.calculateDiscount();
                double finalPrice = p.getPrice() + tax - discount;
                System.out.printf("%s (%s): Price=%.2f, Tax=%.2f, Discount=%.2f, Final=%.2f\n",
                    p.getName(), p.getClass().getSimpleName(), p.getPrice(), tax, discount, finalPrice);
            }
        }
    }

    // 3. Vehicle Rental System
    static class VehicleRentalDemo {
        static abstract class Vehicle {
            private String vehicleNumber;
            private String type;
            private double rentalRate; // per day

            public Vehicle(String vehicleNumber, String type, double rentalRate) {
                this.vehicleNumber = vehicleNumber;
                this.type = type;
                this.rentalRate = rentalRate;
            }

            public String getVehicleNumber() { return vehicleNumber; }
            public String getType() { return type; }
            public double getRentalRate() { return rentalRate; }

            public abstract double calculateRentalCost(int days);
        }

        interface Insurable {
            double calculateInsurance();
            String getInsuranceDetails();
        }

        static class Car extends Vehicle implements Insurable {
            private String policyNumber;
            public Car(String vehicleNumber, double rentalRate, String policyNumber) {
                super(vehicleNumber, "Car", rentalRate);
                this.policyNumber = policyNumber;
            }
            @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
            @Override public double calculateInsurance() { return 5000; }
            @Override public String getInsuranceDetails() { return policyNumber; }
        }

        static class Bike extends Vehicle implements Insurable {
            private String policyNumber;
            public Bike(String vehicleNumber, double rentalRate, String policyNumber) {
                super(vehicleNumber, "Bike", rentalRate);
                this.policyNumber = policyNumber;
            }
            @Override public double calculateRentalCost(int days) { return getRentalRate() * days; }
            @Override public double calculateInsurance() { return 1200; }
            @Override public String getInsuranceDetails() { return policyNumber; }
        }

        static class Truck extends Vehicle {
            public Truck(String vehicleNumber, double rentalRate) { super(vehicleNumber, "Truck", rentalRate); }
            @Override public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
        }

        public static void run() {
            Vehicle[] fleet = new Vehicle[] {
                new Car("KA01AB1234", 3000, "CAR-POL-001"),
                new Bike("KA01XY9876", 500, "BIKE-POL-009"),
                new Truck("KA02TR4444", 8000)
            };

            for (Vehicle v: fleet) {
                double rent = v.calculateRentalCost(3);
                String ins = (v instanceof Insurable) ? ((Insurable)v).getInsuranceDetails() : "N/A";
                double insuranceCost = (v instanceof Insurable) ? ((Insurable)v).calculateInsurance() : 0;
                System.out.printf("%s (%s): Rental(3 days)=%.2f, Insurance=%s(%.2f)\n",
                    v.getVehicleNumber(), v.getClass().getSimpleName(), rent, ins, insuranceCost);
            }
        }
    }

    // 4. Banking System
    static class BankingDemo {
        static abstract class BankAccount {
            private String accountNumber;
            private String holderName;
            private double balance;

            public BankAccount(String accountNumber, String holderName, double balance) {
                this.accountNumber = accountNumber;
                this.holderName = holderName;
                this.balance = balance;
            }

            public String getAccountNumber() { return accountNumber; }
            public String getHolderName() { return holderName; }
            public double getBalance() { return balance; }

            public void deposit(double amount) {
                if (amount <= 0) throw new IllegalArgumentException("Deposit amount must be positive");
                balance += amount;
            }

            public void withdraw(double amount) {
                if (amount <= 0) throw new IllegalArgumentException("Withdraw amount must be positive");
                if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
                balance -= amount;
            }

            public abstract double calculateInterest();
        }

        interface Loanable {
            boolean applyForLoan(double amount);
            double calculateLoanEligibility();
        }

        static class SavingsAccount extends BankAccount implements Loanable {
            public SavingsAccount(String acc, String name, double bal) { super(acc, name, bal); }
            @Override public double calculateInterest() { return getBalance() * 0.04; }
            @Override public boolean applyForLoan(double amount) { return calculateLoanEligibility() >= amount; }
            @Override public double calculateLoanEligibility() { return getBalance() * 2; }
        }

        static class CurrentAccount extends BankAccount {
            public CurrentAccount(String acc, String name, double bal) { super(acc, name, bal); }
            @Override public double calculateInterest() { return 0; }
        }

        public static void run() {
            BankAccount s = new SavingsAccount("S001","Charlie", 10000);
            BankAccount c = new CurrentAccount("C001","Dana", 2000);

            s.deposit(2000);
            try { c.withdraw(500); } catch (Exception e) { /* ignore */ }

            BankAccount[] accounts = new BankAccount[] {s, c};
            for (BankAccount a: accounts) {
                System.out.printf("%s (%s): Balance=%.2f, Interest=%.2f\n",
                    a.getHolderName(), a.getClass().getSimpleName(), a.getBalance(), a.calculateInterest());
            }

            if (s instanceof Loanable) {
                Loanable L = (Loanable)s;
                System.out.printf("SavingsAccount loan eligibility: %.2f, applyForLoan 15000: %b\n",
                    L.calculateLoanEligibility(), L.applyForLoan(15000));
            }
        }
    }

    // 5. Library Management System
    static class LibraryDemo {
        static abstract class LibraryItem {
            private String itemId;
            private String title;
            private String author;

            public LibraryItem(String itemId, String title, String author) {
                this.itemId = itemId; this.title = title; this.author = author;
            }

            public String getItemId() { return itemId; }
            public String getTitle() { return title; }
            public String getAuthor() { return author; }

            public String getItemDetails() {
                return String.format("%s - %s by %s", itemId, title, author);
            }

            public abstract int getLoanDuration();
        }

        interface Reservable {
            boolean reserveItem(String userId);
            boolean checkAvailability();
        }

        static class Book extends LibraryItem implements Reservable {
            private boolean available = true;
            public Book(String id, String title, String author) { super(id, title, author); }
            @Override public int getLoanDuration() { return 21; }
            @Override public boolean reserveItem(String userId) { if (available) { available = false; return true; } return false; }
            @Override public boolean checkAvailability() { return available; }
        }

        static class Magazine extends LibraryItem {
            public Magazine(String id, String title, String author) { super(id, title, author); }
            @Override public int getLoanDuration() { return 7; }
        }

        static class DVD extends LibraryItem implements Reservable {
            private boolean available = true;
            public DVD(String id, String title, String author) { super(id, title, author); }
            @Override public int getLoanDuration() { return 3; }
            @Override public boolean reserveItem(String userId) { if (available) { available = false; return true; } return false; }
            @Override public boolean checkAvailability() { return available; }
        }

        public static void run() {
            LibraryItem[] items = new LibraryItem[] {
                new Book("B001","Effective Java","Joshua Bloch"),
                new Magazine("M001","Nature - July","Nature Editors"),
                new DVD("D001","Inception","Christopher Nolan")
            };

            for (LibraryItem item: items) {
                System.out.printf("%s: LoanDuration=%d days, Details=%s\n",
                    item.getClass().getSimpleName(), item.getLoanDuration(), item.getItemDetails());
                if (item instanceof Reservable) {
                    Reservable r = (Reservable)item;
                    System.out.printf("Available: %b, Reserve attempt: %b\n", r.checkAvailability(), r.reserveItem("user1"));
                }
            }
        }
    }

    // 6. Online Food Delivery System
    static class FoodDeliveryDemo {
        static abstract class FoodItem {
            private String itemName;
            private double price;
            private int quantity;

            public FoodItem(String itemName, double price, int quantity) {
                this.itemName = itemName; setPrice(price); this.quantity = quantity;
            }

            public String getItemName() { return itemName; }
            public double getPrice() { return price; }
            public void setPrice(double price) { if (price < 0) throw new IllegalArgumentException("Price negative"); this.price = price; }
            public int getQuantity() { return quantity; }
            public void setQuantity(int quantity) { this.quantity = quantity; }

            public String getItemDetails() { return String.format("%s x%d @ %.2f", itemName, quantity, price); }
            public abstract double calculateTotalPrice();
        }

        interface Discountable {
            double applyDiscount();
            String getDiscountDetails();
        }

        static class VegItem extends FoodItem implements Discountable {
            public VegItem(String name, double price, int qty) { super(name, price, qty); }
            @Override public double calculateTotalPrice() { return getPrice() * getQuantity(); }
            @Override public double applyDiscount() { return calculateTotalPrice() * 0.10; }
            @Override public String getDiscountDetails() { return "10% Veg Discount"; }
        }

        static class NonVegItem extends FoodItem implements Discountable {
            public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
            @Override public double calculateTotalPrice() { return (getPrice() + 20) * getQuantity(); }
            @Override public double applyDiscount() { return calculateTotalPrice() * 0.05; }
            @Override public String getDiscountDetails() { return "5% Non-Veg Discount + NonVeg Charge 20/item"; }
        }

        public static void run() {
            FoodItem[] order = new FoodItem[] {
                new VegItem("Paneer Butter Masala", 220, 2),
                new NonVegItem("Chicken Biryani", 250, 1)
            };

            double total = 0;
            for (FoodItem f: order) {
                double subtotal = f.calculateTotalPrice();
                double discount = (f instanceof Discountable) ? ((Discountable)f).applyDiscount() : 0;
                double finalPrice = subtotal - discount;
                System.out.printf("%s: Subtotal=%.2f, Discount=%.2f, Final=%.2f\n", f.getItemDetails(), subtotal, discount, finalPrice);
                total += finalPrice;
            }
            System.out.printf("Order Total: %.2f\n", total);
        }
    }

    // 7. Hospital Patient Management
    static class HospitalDemo {
        static abstract class Patient {
            private String patientId;
            private String name;
            private int age;

            public Patient(String patientId, String name, int age) {
                this.patientId = patientId; this.name = name; this.age = age;
            }

            public String getPatientId() { return patientId; }
            public String getName() { return name; }
            public int getAge() { return age; }

            public String getPatientDetails() { return String.format("%s: %s (%d)", patientId, name, age); }
            public abstract double calculateBill();
        }

        interface MedicalRecord {
            void addRecord(String entry);
            String viewRecords();
        }

        static class InPatient extends Patient implements MedicalRecord {
            private int daysAdmitted;
            private StringBuilder records = new StringBuilder();
            public InPatient(String id, String name, int age, int days) { super(id,name,age); this.daysAdmitted = days; }
            @Override public double calculateBill() { return daysAdmitted * 2000; }
            @Override public void addRecord(String entry) { records.append(entry).append("; "); }
            @Override public String viewRecords() { return records.toString(); }
        }

        static class OutPatient extends Patient implements MedicalRecord {
            private int consultations;
            private StringBuilder records = new StringBuilder();
            public OutPatient(String id, String name, int age, int consultations) { super(id,name,age); this.consultations = consultations; }
            @Override public double calculateBill() { return consultations * 500; }
            @Override public void addRecord(String entry) { records.append(entry).append("; "); }
            @Override public String viewRecords() { return records.toString(); }
        }

        public static void run() {
            Patient[] patients = new Patient[] {
                new InPatient("IP001","Eve",45,5),
                new OutPatient("OP001","Frank",30,2)
            };

            for (Patient p: patients) {
                if (p instanceof MedicalRecord) {
                    ((MedicalRecord)p).addRecord("Initial Checkup");
                }
                System.out.printf("%s Bill=%.2f, Records=%s\n", p.getPatientDetails(), p.calculateBill(), ((MedicalRecord)p).viewRecords());
            }
        }
    }

    // 8. Ride-Hailing Application
    static class RideHailingDemo {
        static abstract class Vehicle {
            private String vehicleId;
            private String driverName;
            private double ratePerKm;

            public Vehicle(String vehicleId, String driverName, double ratePerKm) {
                this.vehicleId = vehicleId; this.driverName = driverName; this.ratePerKm = ratePerKm;
            }

            public String getVehicleId() { return vehicleId; }
            public String getDriverName() { return driverName; }
            public double getRatePerKm() { return ratePerKm; }

            public String getVehicleDetails() { return String.format("%s - %s", vehicleId, driverName); }
            public abstract double calculateFare(double distance);
        }

        interface GPS {
            String getCurrentLocation();
            void updateLocation(String location);
        }

        static class Car extends Vehicle implements GPS {
            private String location = "Unknown";
            public Car(String vid, String dname, double rate) { super(vid,dname,rate); }
            @Override public double calculateFare(double distance) { return getRatePerKm() * distance + 50; }
            @Override public String getCurrentLocation() { return location; }
            @Override public void updateLocation(String location) { this.location = location; }
        }

        static class Bike extends Vehicle implements GPS {
            private String location = "Unknown";
            public Bike(String vid, String dname, double rate) { super(vid,dname,rate); }
            @Override public double calculateFare(double distance) { return getRatePerKm() * distance; }
            @Override public String getCurrentLocation() { return location; }
            @Override public void updateLocation(String location) { this.location = location; }
        }

        static class Auto extends Vehicle {
            public Auto(String vid, String dname, double rate) { super(vid,dname,rate); }
            @Override public double calculateFare(double distance) { return getRatePerKm() * distance + 20; }
        }

        public static void run() {
            Vehicle[] drivers = new Vehicle[] {
                new Car("V001","Gautam",15),
                new Bike("V002","Harsha",8),
                new Auto("V003","Imran",10)
            };

            for (Vehicle v: drivers) {
                double fare = v.calculateFare(12.5);
                System.out.printf("%s (%s): Fare for 12.5km = %.2f\n", v.getVehicleDetails(), v.getClass().getSimpleName(), fare);
            }
        }
    }
}
