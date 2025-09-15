
// // import java.util.Scanner;

// // public class Level2 {

// //     // // Q1: Bonus of 10 employees
// //     // public static void q1BonusCalculation() {
// //     //     Scanner sc = new Scanner(System.in);
// //     //     final int EMPLOYEES = 10;
// //     //     double[] salary = new double[EMPLOYEES];
// //     //     int[] years = new int[EMPLOYEES];
// //     //     double[] bonus = new double[EMPLOYEES];
// //     //     double[] newSalary = new double[EMPLOYEES];
// //     //     double totalBonus = 0, totalOld = 0, totalNew = 0;
// //     //     for (int i = 0; i < EMPLOYEES; i++) {
// //     //         System.out.print("Enter salary of employee " + (i + 1) + ": ");
// //     //         salary[i] = sc.nextDouble();
// //     //         System.out.print("Enter years of service of employee " + (i + 1) + ": ");
// //     //         years[i] = sc.nextInt();
// //     //         if (years[i] > 5) {
// //     //             bonus[i] = salary[i] * 0.05;
// //     //         } else {
// //     //             bonus[i] = salary[i] * 0.02;
// //     //         }
// //     //         newSalary[i] = salary[i] + bonus[i];
// //     //         totalBonus += bonus[i];
// //     //         totalOld += salary[i];
// //     //         totalNew += newSalary[i];
// //     //     }
// //     //     System.out.println("\nEmp\tSalary\tYears\tBonus\tNew Salary");
// //     //     for (int i = 0; i < EMPLOYEES; i++) {
// //     //         System.out.printf("%d\t%.2f\t%d\t%.2f\t%.2f\n",
// //     //                 (i + 1), salary[i], years[i], bonus[i], newSalary[i]);
// //     //     }
// //     //     System.out.printf("\nTotal Old Salary: %.2f\n", totalOld);
// //     //     System.out.printf("Total Bonus: %.2f\n", totalBonus);
// //     //     System.out.printf("Total New Salary: %.2f\n", totalNew);
// //     // }
// //     // Q2: Youngest and tallest among 3 friends
// //     public static void q2YoungestTallest() {
// //         Scanner sc = new Scanner(System.in);
// //         String[] names = {"Amar", "Akbar", "Anthony"};
// //         int[] ages = new int[3];
// //         int[] heights = new int[3];

// //         for (int i = 0; i < 3; i++) {
// //             System.out.print("Enter age of " + names[i] + ": ");
// //             ages[i] = sc.nextInt();
// //             System.out.print("Enter height of " + names[i] + ": ");
// //             heights[i] = sc.nextInt();
// //         }

// //         int youngestIdx = 0, tallestIdx = 0;
// //         for (int i = 1; i < 3; i++) {
// //             if (ages[i] < ages[youngestIdx]) {
// //                 youngestIdx = i;
// //             }
// //             if (heights[i] > heights[tallestIdx]) {
// //                 tallestIdx = i;
// //             }
// //         }

// //         System.out.println("Youngest: " + names[youngestIdx]);
// //         System.out.println("Tallest: " + names[tallestIdx]);
// //     }

// //     // Q3: Largest and second largest digit of a number
// //     public static void q3LargestTwoDigits() {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number: ");
// //         int num = sc.nextInt();

// //         int[] digits = new int[10];
// //         int index = 0;

// //         while (num > 0 && index < 10) {
// //             digits[index++] = num % 10;
// //             num /= 10;
// //         }

// //         int largest = 0, second = 0;
// //         for (int i = 0; i < index; i++) {
// //             if (digits[i] > largest) {
// //                 second = largest;
// //                 largest = digits[i];
// //             } else if (digits[i] > second && digits[i] != largest) {
// //                 second = digits[i];
// //             }
// //         }

// //         System.out.println("Largest digit: " + largest);
// //         System.out.println("Second largest digit: " + second);
// //     }

// //     // Q4: Largest and second largest digit (dynamic array expansion)
// //     public static void q4LargestTwoDigitsDynamic() {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number: ");
// //         int num = sc.nextInt();

// //         int maxDigit = 10;
// //         int[] digits = new int[maxDigit];
// //         int index = 0;

// //         while (num > 0) {
// //             if (index == maxDigit) {
// //                 maxDigit += 10;
// //                 int[] temp = new int[maxDigit];
// //                 System.arraycopy(digits, 0, temp, 0, digits.length);
// //                 digits = temp;
// //             }
// //             digits[index++] = num % 10;
// //             num /= 10;
// //         }

// //         int largest = 0, second = 0;
// //         for (int i = 0; i < index; i++) {
// //             if (digits[i] > largest) {
// //                 second = largest;
// //                 largest = digits[i];
// //             } else if (digits[i] > second && digits[i] != largest) {
// //                 second = digits[i];
// //             }
// //         }

// //         System.out.println("Largest digit: " + largest);
// //         System.out.println("Second largest digit: " + second);
// //     }

// //     // Q5: Reverse number using array
// //     public static void q5ReverseNumber() {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number: ");
// //         int num = sc.nextInt();

// //         int count = 0, temp = num;
// //         while (temp > 0) {
// //             count++;
// //             temp /= 10;
// //         }

// //         int[] digits = new int[count];
// //         for (int i = 0; i < count; i++) {
// //             digits[i] = num % 10;
// //             num /= 10;
// //         }

// //         System.out.print("Reversed number: ");
// //         for (int i = 0; i < count; i++) {
// //             System.out.print(digits[i]);
// //         }
// //         System.out.println();
// //     }

// //     // Q6: BMI calculation
// //     public static void q6BMI() {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter number of persons: ");
// //         int n = sc.nextInt();

// //         double[] height = new double[n];
// //         double[] weight = new double[n];
// //         double[] bmi = new double[n];
// //         String[] status = new String[n];

// //         for (int i = 0; i < n; i++) {
// //             System.out.print("Enter height (m) for person " + (i + 1) + ": ");
// //             height[i] = sc.nextDouble();
// //             System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
// //             weight[i] = sc.nextDouble();

// //             bmi[i] = weight[i] / (height[i] * height[i]);

// //             if (bmi[i] < 18.5) {
// //                 status[i] = "Underweight"; 
// //             }else if (bmi[i] < 25) {
// //                 status[i] = "Normal"; 
// //             }else if (bmi[i] < 30) {
// //                 status[i] = "Overweight"; 
// //             }else {
// //                 status[i] = "Obese";
// //             }
// //         }

// //         System.out.println("\nPerson\tHeight\tWeight\tBMI\tStatus");
// //         for (int i = 0; i < n; i++) {
// //             System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", (i + 1), height[i], weight[i], bmi[i], status[i]);
// //         }
// //     }

// //     // Q7: BMI with 2D array
// //     public static void q7BMI2D() {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter number of persons: ");
// //         int n = sc.nextInt();

// //         double[][] personData = new double[n][3]; // height, weight, bmi
// //         String[] status = new String[n];

// //         for (int i = 0; i < n; i++) {
// //             System.out.print("Enter height (m) for person " + (i + 1) + ": ");
// //             personData[i][0] = sc.nextDouble();
// //             System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
// //             personData[i][1] = sc.nextDouble();

// //             personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

// //             if (personData[i][2] < 18.5) {
// //                 status[i] = "Underweight"; 
// //             }else if (personData[i][2] < 25) {
// //                 status[i] = "Normal"; 
// //             }else if (personData[i][2] < 30) {
// //                 status[i] = "Overweight"; 
// //             }else {
// //                 status[i] = "Obese";
// //             }
// //         }

// //         System.out.println("\nPerson\tHeight\tWeight\tBMI\tStatus");
// //         for (int i = 0; i < n; i++) {
// //             System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", (i + 1),
// //                     personData[i][0], personData[i][1], personData[i][2], status[i]);
// //         }
// //     }

// //     // Q8: Marks, percentage and grade
// //     public static void q8MarksGrade() {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter number of students: ");
// //         int n = sc.nextInt();

// //         int[][] marks = new int[n][3];
// //         double[] percentage = new double[n];
// //         char[] grade = new char[n];

// //         for (int i = 0; i < n; i++) {
// //             System.out.println("Enter marks for student " + (i + 1));
// //             for (int j = 0; j < 3; j++) {
// //                 marks[i][j] = sc.nextInt();
// //             }
// //             int total = marks[i][0] + marks[i][1] + marks[i][2];
// //             percentage[i] = total / 3.0;

// //             if (percentage[i] >= 90) {
// //                 grade[i] = 'A'; 
// //             }else if (percentage[i] >= 75) {
// //                 grade[i] = 'B'; 
// //             }else if (percentage[i] >= 60) {
// //                 grade[i] = 'C'; 
// //             }else if (percentage[i] >= 40) {
// //                 grade[i] = 'D'; 
// //             }else {
// //                 grade[i] = 'F';
// //             }
// //         }

// //         System.out.println("Student\tPhysics\tChemistry\tMaths\t%\tGrade");
// //         for (int i = 0; i < n; i++) {
// //             System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%c\n",
// //                     (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
// //         }
// //     }

// //     // Q9: Same as Q8 but with 2D array for marks
// //     public static void q9MarksGrade2D() {
// //         q8MarksGrade(); // same logic (already used 2D array above)
// //     }

// //     // Q10: Frequency of digits in a number
// //     public static void q10DigitFrequency() {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.print("Enter a number: ");
// //         int num = sc.nextInt();

// //         int[] freq = new int[10];

// //         while (num > 0) {
// //             freq[num % 10]++;
// //             num /= 10;
// //         }

// //         System.out.println("Digit frequencies:");
// //         for (int i = 0; i < 10; i++) {
// //             if (freq[i] > 0) {
// //                 System.out.println(i + " -> " + freq[i]);
// //             }
// //         }
// //     }

// //     public static void main(String[] args) {
// //         // Call the problem you want to test
// //         q1BonusCalculation();
// //         import java.util.Scanner;



//     public class Level2 {

//         // Q1: Bonus of 10 employees
//         public static void q1BonusCalculation() {
//             Scanner sc = new Scanner(System.in);
//             final int EMPLOYEES = 10;
//             double[] salary = new double[EMPLOYEES];
//             int[] years = new int[EMPLOYEES];
//             double[] bonus = new double[EMPLOYEES];
//             double[] newSalary = new double[EMPLOYEES];

//             double totalBonus = 0, totalOld = 0, totalNew = 0;

//             for (int i = 0; i < EMPLOYEES; i++) {
//                 System.out.print("Enter salary of employee " + (i + 1) + ": ");
//                 salary[i] = sc.nextDouble();
//                 System.out.print("Enter years of service of employee " + (i + 1) + ": ");
//                 years[i] = sc.nextInt();

//                 if (years[i] > 5) {
//                     bonus[i] = salary[i] * 0.05;
//                 } else {
//                     bonus[i] = salary[i] * 0.02;
//                 }

//                 newSalary[i] = salary[i] + bonus[i];
//                 totalBonus += bonus[i];
//                 totalOld += salary[i];
//                 totalNew += newSalary[i];
//             }

//             System.out.println("\nEmp\tSalary\tYears\tBonus\tNew Salary");
//             for (int i = 0; i < EMPLOYEES; i++) {
//                 System.out.printf("%d\t%.2f\t%d\t%.2f\t%.2f\n",
//                         (i + 1), salary[i], years[i], bonus[i], newSalary[i]);
//             }

//             System.out.printf("\nTotal Old Salary: %.2f\n", totalOld);
//             System.out.printf("Total Bonus: %.2f\n", totalBonus);
//             System.out.printf("Total New Salary: %.2f\n", totalNew);
//         }

//         // Q2: Youngest and tallest among 3 friends
//         public static void q2YoungestTallest() {
//             Scanner sc = new Scanner(System.in);
//             String[] names = {"Amar", "Akbar", "Anthony"};
//             int[] ages = new int[3];
//             int[] heights = new int[3];

//             for (int i = 0; i < 3; i++) {
//                 System.out.print("Enter age of " + names[i] + ": ");
//                 ages[i] = sc.nextInt();
//                 System.out.print("Enter height of " + names[i] + ": ");
//                 heights[i] = sc.nextInt();
//             }

//             int youngestIdx = 0, tallestIdx = 0;
//             for (int i = 1; i < 3; i++) {
//                 if (ages[i] < ages[youngestIdx]) {
//                     youngestIdx = i;
//                 }
//                 if (heights[i] > heights[tallestIdx]) {
//                     tallestIdx = i;
//                 }
//             }

//             System.out.println("Youngest: " + names[youngestIdx]);
//             System.out.println("Tallest: " + names[tallestIdx]);
//         }

//         // Q3: Largest and second largest digit of a number
//         public static void q3LargestTwoDigits() {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter a number: ");
//             int num = sc.nextInt();

//             int[] digits = new int[10];
//             int index = 0;

//             while (num > 0 && index < 10) {
//                 digits[index++] = num % 10;
//                 num /= 10;
//             }

//             int largest = 0, second = 0;
//             for (int i = 0; i < index; i++) {
//                 if (digits[i] > largest) {
//                     second = largest;
//                     largest = digits[i];
//                 } else if (digits[i] > second && digits[i] != largest) {
//                     second = digits[i];
//                 }
//             }

//             System.out.println("Largest digit: " + largest);
//             System.out.println("Second largest digit: " + second);
//         }

//         // Q4: Largest and second largest digit (dynamic array expansion)
//         public static void q4LargestTwoDigitsDynamic() {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter a number: ");
//             int num = sc.nextInt();

//             int maxDigit = 10;
//             int[] digits = new int[maxDigit];
//             int index = 0;

//             while (num > 0) {
//                 if (index == maxDigit) {
//                     maxDigit += 10;
//                     int[] temp = new int[maxDigit];
//                     System.arraycopy(digits, 0, temp, 0, digits.length);
//                     digits = temp;
//                 }
//                 digits[index++] = num % 10;
//                 num /= 10;
//             }

//             int largest = 0, second = 0;
//             for (int i = 0; i < index; i++) {
//                 if (digits[i] > largest) {
//                     second = largest;
//                     largest = digits[i];
//                 } else if (digits[i] > second && digits[i] != largest) {
//                     second = digits[i];
//                 }
//             }

//             System.out.println("Largest digit: " + largest);
//             System.out.println("Second largest digit: " + second);
//         }

//         // Q5: Reverse number using array
//         public static void q5ReverseNumber() {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter a number: ");
//             int num = sc.nextInt();

//             int count = 0, temp = num;
//             while (temp > 0) {
//                 count++;
//                 temp /= 10;
//             }

//             int[] digits = new int[count];
//             for (int i = 0; i < count; i++) {
//                 digits[i] = num % 10;
//                 num /= 10;
//             }

//             System.out.print("Reversed number: ");
//             for (int i = 0; i < count; i++) {
//                 System.out.print(digits[i]);
//             }
//             System.out.println();
//         }

//         // Q6: BMI calculation
//         public static void q6BMI() {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter number of persons: ");
//             int n = sc.nextInt();

//             double[] height = new double[n];
//             double[] weight = new double[n];
//             double[] bmi = new double[n];
//             String[] status = new String[n];

//             for (int i = 0; i < n; i++) {
//                 System.out.print("Enter height (m) for person " + (i + 1) + ": ");
//                 height[i] = sc.nextDouble();
//                 System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
//                 weight[i] = sc.nextDouble();

//                 bmi[i] = weight[i] / (height[i] * height[i]);

//                 if (bmi[i] < 18.5) {
//                     status[i] = "Underweight"; 
//                 }else if (bmi[i] < 25) {
//                     status[i] = "Normal"; 
//                 }else if (bmi[i] < 30) {
//                     status[i] = "Overweight"; 
//                 }else {
//                     status[i] = "Obese";
//                 }
//             }

//             System.out.println("\nPerson\tHeight\tWeight\tBMI\tStatus");
//             for (int i = 0; i < n; i++) {
//                 System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", (i + 1), height[i], weight[i], bmi[i], status[i]);
//             }
//         }

//         // Q7: BMI with 2D array
//         public static void q7BMI2D() {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter number of persons: ");
//             int n = sc.nextInt();

//             double[][] personData = new double[n][3]; // height, weight, bmi
//             String[] status = new String[n];

//             for (int i = 0; i < n; i++) {
//                 System.out.print("Enter height (m) for person " + (i + 1) + ": ");
//                 personData[i][0] = sc.nextDouble();
//                 System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
//                 personData[i][1] = sc.nextDouble();

//                 personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);

//                 if (personData[i][2] < 18.5) {
//                     status[i] = "Underweight"; 
//                 }else if (personData[i][2] < 25) {
//                     status[i] = "Normal"; 
//                 }else if (personData[i][2] < 30) {
//                     status[i] = "Overweight"; 
//                 }else {
//                     status[i] = "Obese";
//                 }
//             }

//             System.out.println("\nPerson\tHeight\tWeight\tBMI\tStatus");
//             for (int i = 0; i < n; i++) {
//                 System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s\n", (i + 1),
//                         personData[i][0], personData[i][1], personData[i][2], status[i]);
//             }
//         }

//         // Q8: Marks, percentage and grade
//         public static void q8MarksGrade() {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter number of students: ");
//             int n = sc.nextInt();

//             int[][] marks = new int[n][3];
//             double[] percentage = new double[n];
//             char[] grade = new char[n];

//             for (int i = 0; i < n; i++) {
//                 System.out.println("Enter marks for student " + (i + 1));
//                 for (int j = 0; j < 3; j++) {
//                     marks[i][j] = sc.nextInt();
//                 }
//                 int total = marks[i][0] + marks[i][1] + marks[i][2];
//                 percentage[i] = total / 3.0;

//                 if (percentage[i] >= 90) {
//                     grade[i] = 'A'; 
//                 }else if (percentage[i] >= 75) {
//                     grade[i] = 'B'; 
//                 }else if (percentage[i] >= 60) {
//                     grade[i] = 'C'; 
//                 }else if (percentage[i] >= 40) {
//                     grade[i] = 'D'; 
//                 }else {
//                     grade[i] = 'F';
//                 }
//             }

//             System.out.println("Student\tPhysics\tChemistry\tMaths\t%\tGrade");
//             for (int i = 0; i < n; i++) {
//                 System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%c\n",
//                         (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
//             }
//         }

//         // Q9: Same as Q8 but with 2D array for marks
//         public static void q9MarksGrade2D() {
//             q8MarksGrade(); // same logic (already used 2D array above)
//         }

//         // Q10: Frequency of digits in a number
//         public static void q10DigitFrequency() {
//             Scanner sc = new Scanner(System.in);
//             System.out.print("Enter a number: ");
//             int num = sc.nextInt();

//             int[] freq = new int[10];

//             while (num > 0) {
//                 freq[num % 10]++;
//                 num /= 10;
//             }

//             System.out.println("Digit frequencies:");
//             for (int i = 0; i < 10; i++) {
//                 if (freq[i] > 0) {
//                     System.out.println(i + " -> " + freq[i]);
//                 }
//             }
//         }

//         public static void main(String[] args) {
//             // Call the problem you want to test
//             q1BonusCalculation();
//             // q2YoungestTallest();
//             // q3LargestTwoDigits();
//             // q4LargestTwoDigitsDynamic();
//             // q5ReverseNumber();
//             // q6BMI();
//             // q7BMI2D();
//             // q8MarksGrade();
//             // q9MarksGrade2D();
//             // q10DigitFrequency();
//         }
//     }

// }
// }
