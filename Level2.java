// //Sample Program 1 - Create a program to check if 3 values are internal angles of a triangle.
// import java.util.Scanner;

// class Level2 {
//    public static void main(String[] args) {
//       // Create a Scanner Object
//       Scanner input = new Scanner(System.in);

//       // Get 3 input values for angles
//       int x = input.nextInt();
//       int y = input.nextInt();
//       int z = input.nextInt();

//       // Find the sum of all angles
//       int sumOfAngles = x + y + z;

//       // Check if sum is equal to 180 and print either true or false
//       System.out.println("The given angles " +x+ ", " +y+ ", " + z + 
// 			     " add to " + sumOfAngles);

//       if (sumOfAngles == 180) {
//          System.out.println("The given angles are internal angles of a " +
// 				 "Triangle");
//       } else {
//          System.out.println("The given angles are not internal angles " +
// 			        "of a Triangle");
//       }

//       // Closing the Scanner Stream
//       input.close();
//    }
// }

// //Sample Program 2 - Create a program to find the sum of all the digits of a number given by a user.

// // Create SunOfDigit Class to compute the sum of all digits of a number
// import java.util.Scanner;

// class Level2 {

//    public static void main(String[] args) {
//       // Create a Scanner Object
//       Scanner input = new Scanner(System.in);

//       // Get input value for number
//       int origNumber = input.nextInt();

//       // Define variable number and sum initialized to zero 
//       int number = origNumber;
//       int sum = 0;

//       // Run while loop to access each digit of number
//       while (number != 0) {
//          // Use number % 10 to find each digit of number from last
//          int digit = number % 10;

//          // add each digit to sum
//          sum += digit;

//          // Remove last digit from number essentially get the quotient
//          number = number / 10;
//       }

//       // Print the sum and close the Scanner Stream
//       System.out.println("The sum of digit of number:" +origNumber+ " = " + 
//                          sum);
//       input.close();
//    }
// }

// //1. Print Odd and Even Numbers

// import java.util.Scanner;

// public class LEvel2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         if (number <= 0) {
//             System.out.println("Please enter a natural number.");
//         } else {
//             for (int i = 1; i <= number; i++) {
//                 if (i % 2 == 0)
//                     System.out.println(i + " is Even");
//                 else
//                     System.out.println(i + " is Odd");
//             }
//         }
//     }
// }

// //2. Employee Bonus

// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter salary: ");
//         double salary = sc.nextDouble();
//         System.out.print("Enter years of service: ");
//         int years = sc.nextInt();

//         if (years > 5) {
//             double bonus = salary * 0.05;
//             System.out.println("Bonus = " + bonus);
//         } else {
//             System.out.println("No bonus");
//         }
//     }
// }

// //3. Multiplication Table (6 to 9)

// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         for (int i = 6; i <= 9; i++) {
//             System.out.println(number + " * " + i + " = " + (number * i));
//         }
//     }
// }

// //4. FizzBuzz (for loop)

// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a positive number: ");
//         int number = sc.nextInt();

//         if (number > 0) {
//             for (int i = 1; i <= number; i++) {
//                 if (i % 3 == 0 && i % 5 == 0)
//                     System.out.println("FizzBuzz");
//                 else if (i % 3 == 0)
//                     System.out.println("Fizz");
//                 else if (i % 5 == 0)
//                     System.out.println("Buzz");
//                 else
//                     System.out.println(i);
//             }
//         } else {
//             System.out.println("Please enter a positive integer.");
//         }
//     }
// }

// //5. FizzBuzz (while loop)
// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a positive number: ");
//         int number = sc.nextInt();

//         if (number > 0) {
//             int i = 1;
//             while (i <= number) {
//                 if (i % 3 == 0 && i % 5 == 0)
//                     System.out.println("FizzBuzz");
//                 else if (i % 3 == 0)
//                     System.out.println("Fizz");
//                 else if (i % 5 == 0)
//                     System.out.println("Buzz");
//                 else
//                     System.out.println(i);
//                 i++;
//             }
//         } else {
//             System.out.println("Please enter a positive integer.");
//         }
//     }
// }

// //6. Youngest and Tallest Friend
// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String[] names = {"Amar", "Akbar", "Anthony"};
//         int[] ages = new int[3];
//         int[] heights = new int[3];

//         for (int i = 0; i < 3; i++) {
//             System.out.print("Enter age of " + names[i] + ": ");
//             ages[i] = sc.nextInt();
//             System.out.print("Enter height of " + names[i] + ": ");
//             heights[i] = sc.nextInt();
//         }

//         // Find youngest
//         int minAgeIndex = 0;
//         for (int i = 1; i < 3; i++) {
//             if (ages[i] < ages[minAgeIndex]) minAgeIndex = i;
//         }

//         // Find tallest
//         int maxHeightIndex = 0;
//         for (int i = 1; i < 3; i++) {
//             if (heights[i] > heights[maxHeightIndex]) maxHeightIndex = i;
//         }

//         System.out.println("Youngest friend is: " + names[minAgeIndex]);
//         System.out.println("Tallest friend is: " + names[maxHeightIndex]);
//     }
// }

// //7. Factors (for loop)

// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a positive number: ");
//         int number = sc.nextInt();

//         if (number > 0) {
//             for (int i = 1; i < number; i++) {
//                 if (number % i == 0)
//                     System.out.println(i);
//             }
//         } else {
//             System.out.println("Invalid input.");
//         }
//     }
// }

// //8. Factors (while loop)
// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a positive number: ");
//         int number = sc.nextInt();

//         if (number > 0) {
//             int i = 1;
//             while (i < number) {
//                 if (number % i == 0)
//                     System.out.println(i);
//                 i++;
//             }
//         } else {
//             System.out.println("Invalid input.");
//         }
//     }
// }

// //9. Greatest Factor (for loop)
// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         int greatestFactor = 1;
//         for (int i = number - 1; i >= 1; i--) {
//             if (number % i == 0) {
//                 greatestFactor = i;
//                 break;
//             }
//         }
//         System.out.println("Greatest factor beside itself: " + greatestFactor);
//     }
// }

// //10. Greatest Factor (while loop)
// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         int greatestFactor = 1;
//         int counter = number - 1;

//         while (counter >= 1) {
//             if (number % counter == 0) {
//                 greatestFactor = counter;
//                 break;
//             }
//             counter--;
//         }
//         System.out.println("Greatest factor beside itself: " + greatestFactor);
//     }
// }

// //11. Multiples below 100 (for loop)

// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number less than 100: ");
//         int number = sc.nextInt();

//         if (number > 0 && number < 100) {
//             for (int i = 100; i >= 1; i--) {
//                 if (i % number == 0)
//                     System.out.println(i);
//             }
//         } else {
//             System.out.println("Invalid input.");
//         }
//     }
// }

// //12. Power (for loop)

// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter base number: ");
//         int number = sc.nextInt();
//         System.out.print("Enter power: ");
//         int power = sc.nextInt();

//         int result = 1;
//         for (int i = 1; i <= power; i++) {
//             result *= number;
//         }
//         System.out.println("Result: " + result);
//     }
// }

// // 13. Multiples below 100 (while loop)
// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number less than 100: ");
//         int number = sc.nextInt();

//         if (number > 0 && number < 100) {
//             int counter = 100;
//             while (counter >= 1) {
//                 if (counter % number == 0)
//                     System.out.println(counter);
//                 counter--;
//             }
//         } else {
//             System.out.println("Invalid input.");
//         }
//     }
// }

// //14. Power (while loop)
// import java.util.Scanner;

// public class Level2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter base number: ");
//         int number = sc.nextInt();
//         System.out.print("Enter power: ");
//         int power = sc.nextInt();

//         int result = 1, counter = 0;
//         while (counter < power) {
//             result *= number;
//             counter++;
//         }
//         System.out.println("Result: " + result);
//     }
// }