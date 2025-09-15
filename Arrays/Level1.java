// import java.util.Scanner;

// public class Level1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         checkVotingEligibility(sc);
//         checkNumberProperties(sc);
//         multiplicationTable(sc);
//         storeValuesAndSum(sc);
//         multiplicationTableFrom6To9(sc);
//         meanHeightOfPlayers(sc);
//         saveOddEvenNumbers(sc);
//         findFactors(sc);
//         copy2DTo1DArray(sc);
//         fizzBuzz(sc);

//         sc.close();
//     }

//     static void checkVotingEligibility(Scanner sc) {
//         int[] ages = new int[10];
//         System.out.println("Enter ages of 10 students:");
//         for (int i = 0; i < ages.length; i++) {
//             ages[i] = sc.nextInt();
//         }
//         for (int age : ages) {
//             if (age < 0) {
//                 System.out.println("Invalid age");
//             } else if (age >= 18) {
//                 System.out.println("The student with the age " + age + " can vote.");
//             } else {
//                 System.out.println("The student with the age " + age + " cannot vote.");
//             }
//         }
//     }

//     static void checkNumberProperties(Scanner sc) {
//         int[] numbers = new int[5];
//         System.out.println("Enter 5 numbers:");
//         for (int i = 0; i < numbers.length; i++) {
//             numbers[i] = sc.nextInt();
//         }
//         for (int num : numbers) {
//             if (num > 0) {
//                 System.out.println(num + " is positive and " + (num % 2 == 0 ? "even" : "odd"));
//             } else if (num < 0) {
//                 System.out.println(num + " is negative");
//             } else {
//                 System.out.println(num + " is zero");
//             }
//         }
//         if (numbers[0] == numbers[4]) {
//             System.out.println("First and last elements are equal");
//         } else if (numbers[0] > numbers[4]) {
//             System.out.println("First element is greater than last");
//         } else {
//             System.out.println("First element is less than last");
//         }
//     }

//     static void multiplicationTable(Scanner sc) {
//         System.out.print("Enter a number for multiplication table: ");
//         int number = sc.nextInt();
//         int[] table = new int[10];
//         for (int i = 1; i <= 10; i++) {
//             table[i - 1] = number * i;
//         }
//         for (int i = 0; i < table.length; i++) {
//             System.out.println(number + " * " + (i + 1) + " = " + table[i]);
//         }
//     }

//     static void storeValuesAndSum(Scanner sc) {
//         double[] values = new double[10];
//         double total = 0.0;
//         int index = 0;

//         System.out.println("Enter up to 10 positive numbers (0 or negative to stop):");
//         while (true) {
//             double input = sc.nextDouble();
//             if (input <= 0 || index == 10) break;
//             values[index++] = input;
//         }

//         for (int i = 0; i < index; i++) {
//             total += values[i];
//         }

//         System.out.println("Entered numbers:");
//         for (int i = 0; i < index; i++) {
//             System.out.print(values[i] + " ");
//         }
//         System.out.println("\nTotal sum: " + total);
//     }

//     static void multiplicationTableFrom6To9(Scanner sc) {
//         System.out.print("Enter a number for multiplication table from 6 to 9: ");
//         int number = sc.nextInt();
//         int[] result = new int[4];
//         for (int i = 6; i <= 9; i++) {
//             result[i - 6] = number * i;
//         }
//         for (int i = 6; i <= 9; i++) {
//             System.out.println(number + " * " + i + " = " + result[i - 6]);
//         }
//     }

//     static void meanHeightOfPlayers(Scanner sc) {
//         double[] heights = new double[11];
//         double sum = 0.0;
//         System.out.println("Enter heights of 11 players:");
//         for (int i = 0; i < heights.length; i++) {
//             heights[i] = sc.nextDouble();
//             sum += heights[i];
//         }
//         double mean = sum / heights.length;
//         System.out.println("Mean height of the football team: " + mean);
//     }

//     static void saveOddEvenNumbers(Scanner sc) {
//         System.out.print("Enter a natural number: ");
//         int number = sc.nextInt();
//         if (number <= 0) {
//             System.out.println("Invalid input. Not a natural number.");
//             return;
//         }

//         int[] even = new int[number / 2 + 1];
//         int[] odd = new int[number / 2 + 1];
//         int evenIndex = 0, oddIndex = 0;

//         for (int i = 1; i <= number; i++) {
//             if (i % 2 == 0) {
//                 even[evenIndex++] = i;
//             } else {
//                 odd[oddIndex++] = i;
//             }
//         }

//         System.out.println("Even numbers:");
//         for (int i = 0; i < evenIndex; i++) {
//             System.out.print(even[i] + " ");
//         }
//         System.out.println("\nOdd numbers:");
//         for (int i = 0; i < oddIndex; i++) {
//             System.out.print(odd[i] + " ");
//         }
//         System.out.println();
//     }

//     static void findFactors(Scanner sc) {
//         System.out.print("Enter a number to find its factors: ");
//         int number = sc.nextInt();
//         int maxFactor = 10;
//         int[] factors = new int[maxFactor];
//         int index = 0;

//         for (int i = 1; i <= number; i++) {
//             if (number % i == 0) {
//                 if (index == maxFactor) {
//                     maxFactor *= 2;
//                     int[] temp = new int[maxFactor];
//                     System.arraycopy(factors, 0, temp, 0, factors.length);
//                     factors = temp;
//                 }
//                 factors[index++] = i;
//             }
//         }

//         System.out.println("Factors of " + number + ":");
//         for (int i = 0; i < index; i++) {
//             System.out.print(factors[i] + " ");
//         }
//         System.out.println();
//     }

//     static void copy2DTo1DArray(Scanner sc) {
//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = sc.nextInt();

//         int[][] matrix = new int[rows][cols];
//         int[] array = new int[rows * cols];
//         int index = 0;

//         System.out.println("Enter elements of the matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 matrix[i][j] = sc.nextInt();
//                 array[index++] = matrix[i][j];
//             }
//         }

//         System.out.println("1D array:");
//         for (int val : array) {
//             System.out.print(val + " ");
//         }
//         System.out.println();
//     }

//     static void fizzBuzz(Scanner sc) {
//         System.out.print("Enter a positive number for FizzBuzz: ");
//         int number = sc.nextInt();
//         if (number <= 0) {
//             System.out.println("Invalid input.");
//             return;
//         }

//         String[] result = new String[number + 1];
//         for (int i = 0; i <= number; i++) {
//             if (i % 3 == 0 && i % 5 == 0 && i != 0) {
//                 result[i] = "FizzBuzz";
//             } else if (i % 3 == 0 && i != 0) {
//                 result[i] = "Fizz";
//             } else if (i % 5 == 0 && i != 0) {
//                 result[i] = "Buzz";
//             } else {
//                 result[i] = String.valueOf(i);
//             }
//         }

//         for (int i = 0; i <= number; i++) {
//             System.out.println("Position " + i + " = " + result[i]);
//         }
//     }
// }