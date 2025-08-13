import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        // 1. Harry's age
        harryAge();

        // 2. Sam's average marks
        samAverage();

        // 3. Distance 10.8 km to miles
        kmToMilesFixed();

        // 4. Profit and loss calculation
        profitLoss();

        // 5. Pens distribution
        penDistribution();

        // 6. Course fee discount (fixed)
        courseFeeDiscountFixed();

        // 7. Volume of Earth
        earthVolume();

        // 8. Convert km to miles (user input)
        kmToMilesUser();

        // 9. Course fee discount (user input)
        courseFeeDiscountUser();

        // 10. Height conversion
        heightConversion();

        // 11. Basic calculator
        basicCalculator();

        // 12. Area of triangle
        areaOfTriangle();

        // 13. Side of square from perimeter
        sideOfSquare();

        // 14. Distance in yards and miles
        distanceFeetToYardsMiles();

        // 15. Total purchase price
        totalPurchasePrice();

        // 16. Max handshakes
        maxHandshakes();
    }

    // 1
    public static void harryAge() {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("Harry's age in 2024 is " + age);
    }

    // 2
    public static void samAverage() {
        int maths = 94, physics = 95, chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam’s average mark in PCM is " + average);
    }

    // 3
    public static void kmToMilesFixed() {
        double km = 10.8;
        double miles = km * 1.6;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }

    // 4
    public static void profitLoss() {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit / (double) costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }

    // 5
    public static void penDistribution() {
        int pens = 14, students = 3;
        int perStudent = pens / students;
        int remaining = pens % students;
        System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
    }

    // 6
    public static void courseFeeDiscountFixed() {
        double fee = 125000;
        double discountPercent = 10;
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

    // 7
    public static void earthVolume() {
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }

    // 8
    public static void kmToMilesUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }

    // 9
    public static void courseFeeDiscountUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student Fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter Discount Percent: ");
        double discountPercent = input.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }

    // 10
    public static void heightConversion() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        double heightCm = input.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }

    // 11
    public static void basicCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 +
                " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }

    // 12
    public static void areaOfTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 2.54 * 2.54;
        System.out.println("The area of triangle is " + areaInches + " square inches and " + areaCm + " square cm");
    }

    // 13
    public static void sideOfSquare() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter perimeter: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }

    // 14
    public static void distanceFeetToYardsMiles() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("The distance is " + yards + " yards and " + miles + " miles");
    }

    // 15
    public static void totalPurchasePrice() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        double total = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }

    // 16
    public static void maxHandshakes() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
