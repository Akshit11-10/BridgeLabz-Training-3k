// import java.util.Scanner;

// class Level3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();

//         if (year < 1582) {
//             System.out.println("Leap year calculation is valid only for year >= 1582 (Gregorian calendar).");
//         } else if (year % 400 == 0) {
//             System.out.println(year + " is a Leap Year");
//         } else if (year % 100 == 0) {
//             System.out.println(year + " is NOT a Leap Year");
//         } else if (year % 4 == 0) {
//             System.out.println(year + " is a Leap Year");
//         } else {
//             System.out.println(year + " is NOT a Leap Year");
//         }
//     }
// }



// import java.util.Scanner;

// class Level3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();

//         if (year >= 1582 && ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) )) {
//             System.out.println(year + " is a Leap Year");
//         } else {
//             System.out.println(year + " is NOT a Leap Year");
//         }
//     }
// }



// import java.util.Scanner;

// public class GradeCalculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input marks
//         System.out.print("Enter Physics marks: ");
//         int physics = sc.nextInt();

//         System.out.print("Enter Chemistry marks: ");
//         int chemistry = sc.nextInt();

//         System.out.print("Enter Maths marks: ");
//         int maths = sc.nextInt();

//         // Calculate average percentage
//         double average = (physics + chemistry + maths) / 3.0;
//         System.out.println("Average Percentage: " + average + "%");

//         // Determine grade and remarks
//         String grade, remarks;

//         if (average >= 80) {
//             grade = "A";
//             remarks = "Level 4, above agency-normalized standards";
//         } else if (average >= 70) {
//             grade = "B";
//             remarks = "Level 3, at agency-normalized standards";
//         } else if (average >= 60) {
//             grade = "C";
//             remarks = "Level 2, below, but approaching agency-normalized standards";
//         } else if (average >= 50) {
//             grade = "D";
//             remarks = "Level 1, well below agency-normalized standards";
//         } else if (average >= 40) {
//             grade = "E";
//             remarks = "Level 1-, too below agency-normalized standards";
//         } else {
//             grade = "R";
//             remarks = "Remedial standards";
//         }

//         // Output result
//         System.out.println("Grade: " + grade);
//         System.out.println("Remarks: " + remarks);
//     }
// }
  


// import java.util.Scanner;

// class Level3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         boolean isPrime = true;

//         if (num <= 1) {
//             isPrime = false;  // Prime numbers are > 1
//         } else {
//             for (int i = 2; i <= num / 2; i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break; // divisible by some number
//                 }
//             }
//         }

//         if (isPrime)
//             System.out.println(num + " is a Prime Number");
//         else
//             System.out.println(num + " is NOT a Prime Number");
//     }
// }




// import java.util.Scanner;

// class Level3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         int originalNumber = number;
//         int sum = 0;

//         // Loop through digits
//         while (originalNumber != 0) {
//             int digit = originalNumber % 10;    // Get last digit
//             sum += digit * digit * digit;       // Cube of digit added to sum
//             originalNumber /= 10;               // Remove last digit
//         }

//         if (sum == number) {
//             System.out.println(number + " is an Armstrong Number");
//         } else {
//             System.out.println(number + " is NOT an Armstrong Number");
//         }
//     }
// }



// import java.util.Scanner;

// class Level3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         int count = 0;
//         int temp = number;

//         // Count digits
//         while (temp != 0) {
//             temp /= 10;  // Remove last digit
//             count++;
//         }

//         System.out.println("Number of digits in " + number + " = " + count);
//     }
// }




// import java.util.Scanner;

// public class Level3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Input weight and height
//         System.out.print("Enter weight in kg: ");
//         double weight = sc.nextDouble();

//         System.out.print("Enter height in cm: ");
//         double heightCm = sc.nextDouble();

//         // Convert height to meters
//         double heightM = heightCm / 100;

//         // Calculate BMI
//         double bmi = weight / (heightM * heightM);
//         System.out.printf("Your BMI is: %.2f\n", bmi);

//         // Determine weight status
//         String status;
//         if (bmi <= 18.4) {
//             status = "Underweight";
//         } else if (bmi <= 24.9) {
//             status = "Normal";
//         } else if (bmi <= 39.9) {
//             status = "Overweight";
//         } else {
//             status = "Obese";
//         }

//         System.out.println("Weight Status: " + status);
//     }
// }




// import java.util.Scanner;

// class Level3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         int sum = 0, temp = number;

//         // Find sum of digits
//         while (temp > 0) {
//             int digit = temp % 10;
//             sum += digit;
//             temp /= 10;
//         }

//         if (number % sum == 0) {
//             System.out.println(number + " is a Harshad Number");
//         } else {
//             System.out.println(number + " is NOT a Harshad Number");
//         }
//     }
// }




// import java.util.Scanner;

// class Level3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = sc.nextInt();

//         int sum = 0;

//         // Find divisors and add them
//         for (int i = 1; i < number; i++) {
//             if (number % i == 0) {
//                 sum += i;
//             }
//         }

//         if (sum > number) {
//             System.out.println(number + " is an Abundant Number");
//         } else {
//             System.out.println(number + " is NOT an Abundant Number");
//         }
//     }
// }



// import java.util.Scanner;

// class Level3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         double first = sc.nextDouble();

//         System.out.print("Enter second number: ");
//         double second = sc.nextDouble();

//         System.out.print("Enter operator (+, -, *, /): ");
//         String op = sc.next();

//         double result;

//         switch (op) {
//             case "+":
//                 result = first + second;
//                 System.out.println("Result = " + result);
//                 break;
//             case "-":
//                 result = first - second;
//                 System.out.println("Result = " + result);
//                 break;
//             case "*":
//                 result = first * second;
//                 System.out.println("Result = " + result);
//                 break;
//             case "/":
//                 if (second != 0) {
//                     result = first / second;
//                     System.out.println("Result = " + result);
//                 } else {
//                     System.out.println("Error: Division by zero!");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid Operator!");
//         }
//     }
// }


// public class Level3 {
//     public static void main(String[] args) {
//         // Command-line arguments: month, day, year
//         int m = Integer.parseInt(args[0]);
//         int d = Integer.parseInt(args[1]);
//         int y = Integer.parseInt(args[2]);

//         // Step 1: Adjust year
//         int y0 = y - (14 - m) / 12;

//         // Step 2: Calculate x
//         int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

//         // Step 3: Adjust month
//         int m0 = m + 12 * ((14 - m) / 12) - 2;

//         // Step 4: Calculate day of week
//         int d0 = (d + x + (31 * m0) / 12) % 7;

//         // Output: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
//         System.out.println("Day of the week (0=Sun, 1=Mon,...): " + d0);
//     }
// }












