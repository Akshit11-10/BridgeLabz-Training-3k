
//  1 Harry's age on 2024

// public class Level1 {
//     public static void main(String[] args) {
//         int birthYear = 2000;
//         int currentYear = 2024;
//         int age = currentYear - birthYear;
//         System.out.println("Harry's age in 2024 is " + age);
//     }
// }


//  2. Sam Average PCM Marks

// public class Level1 {
//     public static void main(String[] args) {
//         int maths = 94, physics = 95, chemistry = 96;
//         double average = (maths + physics + chemistry) / 3.0;
//         System.out.println("Sam’s average mark in PCM is " + average);
//     }
// }


//  3. Convert 8.10 Km to Miles

// public class Level1 {
//     public static void main(String[] args) {
//         double km = 10.8;
//         double miles = km / 1.6;
//         System.out.println("The distance " + km + " km in miles is " + miles);
//     }
// }


//  4. Profit and Profit Percentage

// public class Level1 {
//     public static void main(String[] args) {
//         int costPrice = 129;
//         int sellingPrice = 191;
//         int profit = sellingPrice - costPrice;
//         double profitPercent = (profit * 100.0) / costPrice;

//         System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
//                            "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
//     }
// }


//  5. Pen Distribution 
// public class Level1 {
//     public static void main(String[] args) {
//         int pens = 14;
//         int students = 3;
//         int perStudent = pens / students;
//         int remaining = pens % students;

//         System.out.println("The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);
//     }
// }


// 6.  Discounted Fee

// public class Level1 {
//     public static void main(String[] args) {
//         int fee = 125000;
//         int discountPercent = 10;
//         double discount = fee * discountPercent / 100.0;
//         double finalFee = fee - discount;

//         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
//     }
// }


// 7.  Volume of Earth

// public class Level1 {
//     public static void main(String[] args) {
//         double radiusKm = 6378;
//         double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
//         double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);

//         System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
//                            " and cubic miles is " + volumeMiles3);
//     }
// }

// 8 . Convert User to miles (user input)

// import java.util.Scanner;

// public class Level1 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         double km;
//         System.out.print("Enter distance in kilometers: ");
//         km = input.nextDouble();
//         double miles = km / 1.6;

//         System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
//     }
// }


// 9. Discounted Fee (User Input)

// import java.util.Scanner;

// public class Level1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter course fee: ");
//         double fee = sc.nextDouble();
//         System.out.print("Enter discount percentage: ");
//         double discountPercent = sc.nextDouble();

//         double discount = fee * discountPercent / 100;
//         double finalFee = fee - discount;

//         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
//     }
// }

//  10. Height conversion (cm to feet and inches)

// import java.util.Scanner;

// public class Level1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your height in cm: ");
//         double cm = sc.nextDouble();

//         double inches = cm / 2.54;
//         int feet = (int) (inches / 12);
//         double remainingInches = inches % 12;

//         System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainingInches);
//     }
// }


//  11.  Basic Calculator

// import java.util.Scanner;

// public class Level1
//  {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         double number1 = sc.nextDouble();
//         System.out.print("Enter second number: ");
//         double number2 = sc.nextDouble();

//         System.out.println("Addition: " + (number1 + number2));
//         System.out.println("Subtraction: " + (number1 - number2));
//         System.out.println("Multiplication: " + (number1 * number2));
//         System.out.println("Division: " + (number1 / number2));
//     }
// }

//  12. Area of Calulator in cm2 and in2

// import java.util.Scanner;

// public class Level1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter base in cm: ");
//         double base = sc.nextDouble();
//         System.out.print("Enter height in cm: ");
//         double height = sc.nextDouble();

//         double areaCm2 = 0.5 * base * height;
//         double areaIn2 = areaCm2 / 6.4516;

//         System.out.println("Area in square cm: " + areaCm2 + " and in square inches: " + areaIn2);
//     }
// }

//   13 . Side of Square from Perimeter

// import java.util.Scanner;

// public class Level1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter perimeter of square: ");
//         double perimeter = sc.nextDouble();

//         double side = perimeter / 4;
//         System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
//     }
// }



//  14. Convert feet to yards and miles

// import java.util.Scanner;

// public class Level1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter distance in feet: ");
//         double feet = sc.nextDouble();

//         double yards = feet / 3;
//         double miles = yards / 1760;

//         System.out.println("Your distance in feet is " + feet + ", in yards is " + yards + ", and in miles is " + miles);
//     }
// }


//   15.  Total Purchase Price

// import java.util.Scanner;

// public class Level1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter unit price: ");
//         double unitPrice = sc.nextDouble();
//         System.out.print("Enter quantity: ");
//         int quantity = sc.nextInt();

//         double total = unitPrice * quantity;
//         System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
//     }
// }



//  16.  Maximum HandShakes

// import java.util.Scanner;

// public class Level1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of students: ");
//         int n = sc.nextInt();

//         int handshakes = (n * (n - 1)) / 2;
//         System.out.println("Maximum number of handshakes: " + handshakes);
//     }
// }