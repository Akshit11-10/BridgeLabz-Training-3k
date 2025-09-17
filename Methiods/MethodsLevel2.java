// import java.util.*;

// public class MethodsLevel2 {

//     // ---------- 1. FACTORS ----------
//     public static int[] findFactors(int num) {
//         int count = 0;
//         for (int i = 1; i <= num; i++) {
//             if (num % i == 0) count++;
//         }
//         int[] factors = new int[count];
//         int idx = 0;
//         for (int i = 1; i <= num; i++) {
//             if (num % i == 0) {
//                 factors[idx++] = i;
//             }
//         }
//         return factors;
//     }

//     public static int sumOfFactors(int[] factors) {
//         int sum = 0;
//         for (int f : factors) sum += f;
//         return sum;
//     }

//     public static int productOfFactors(int[] factors) {
//         int product = 1;
//         for (int f : factors) product *= f;
//         return product;
//     }

//     public static double sumOfSquares(int[] factors) {
//         double sum = 0;
//         for (int f : factors) sum += Math.pow(f, 2);
//         return sum;
//     }

//     // ---------- 2. NATURAL NUMBERS SUM ----------
//     public static int sumRecursive(int n) {
//         if (n <= 1) return n;
//         return n + sumRecursive(n - 1);
//     }

//     public static int sumFormula(int n) {
//         return n * (n + 1) / 2;
//     }

//     // ---------- 3. LEAP YEAR ----------
//     public static boolean isLeapYear(int year) {
//         if (year < 1582) return false;
//         return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//     }

//     // ---------- 4. UNIT CONVERTER ----------
//     public static double convertKmToMiles(double km) { return km * 0.621371; }
//     public static double convertMilesToKm(double miles) { return miles * 1.60934; }
//     public static double convertMetersToFeet(double m) { return m * 3.28084; }
//     public static double convertFeetToMeters(double ft) { return ft * 0.3048; }
//     public static double convertYardsToFeet(double yards) { return yards * 3; }
//     public static double convertFeetToYards(double ft) { return ft * 0.333333; }
//     public static double convertMetersToInches(double m) { return m * 39.3701; }
//     public static double convertInchesToMeters(double inch) { return inch * 0.0254; }
//     public static double convertInchesToCm(double inch) { return inch * 2.54; }
//     public static double convertFarhenheitToCelsius(double f) { return (f - 32) * 5.0 / 9.0; }
//     public static double convertCelsiusToFarhenheit(double c) { return (c * 9.0 / 5.0) + 32; }
//     public static double convertPoundsToKg(double p) { return p * 0.453592; }
//     public static double convertKgToPounds(double kg) { return kg * 2.20462; }
//     public static double convertGallonsToLiters(double g) { return g * 3.78541; }
//     public static double convertLitersToGallons(double l) { return l * 0.264172; }

//     // ---------- 5. STUDENT VOTE CHECK ----------
//     public static boolean canStudentVote(int age) {
//         if (age < 0) return false;
//         return age >= 18;
//     }

//     // ---------- 6. YOUNGEST & TALLEST ----------
//     public static String findYoungest(String[] names, int[] ages) {
//         int minAge = ages[0], idx = 0;
//         for (int i = 1; i < ages.length; i++) {
//             if (ages[i] < minAge) {
//                 minAge = ages[i];
//                 idx = i;
//             }
//         }
//         return names[idx];
//     }

//     public static String findTallest(String[] names, int[] heights) {
//         int maxH = heights[0], idx = 0;
//         for (int i = 1; i < heights.length; i++) {
//             if (heights[i] > maxH) {
//                 maxH = heights[i];
//                 idx = i;
//             }
//         }
//         return names[idx];
//     }

//     // ---------- 7. POSITIVE, NEGATIVE, EVEN, ODD ----------
//     public static boolean isPositive(int num) { return num >= 0; }
//     public static boolean isEven(int num) { return num % 2 == 0; }

//     public static int compare(int a, int b) {
//         if (a > b) return 1;
//         else if (a == b) return 0;
//         else return -1;
//     }

//     // ---------- 8. BMI ----------
//     public static double calculateBMI(double weightKg, double heightCm) {
//         double hMeters = heightCm / 100.0;
//         return weightKg / (hMeters * hMeters);
//     }

//     public static String bmiStatus(double bmi) {
//         if (bmi < 18.5) return "Underweight";
//         else if (bmi < 25) return "Normal";
//         else if (bmi < 30) return "Overweight";
//         else return "Obese";
//     }

//     // ---------- 9. QUADRATIC ROOTS ----------
//     public static double[] findQuadraticRoots(double a, double b, double c) {
//         double delta = b * b - 4 * a * c;
//         if (delta < 0) return new double[0];
//         else if (delta == 0) return new double[]{ -b / (2 * a) };
//         else {
//             double sqrtD = Math.sqrt(delta);
//             return new double[]{ (-b + sqrtD) / (2 * a), (-b - sqrtD) / (2 * a) };
//         }
//     }

//     // ---------- 10. RANDOM NUMBERS ----------
//     public static int[] generate4DigitRandomArray(int size) {
//         Random rand = new Random();
//         int[] arr = new int[size];
//         for (int i = 0; i < size; i++) {
//             arr[i] = 1000 + rand.nextInt(9000);
//         }
//         return arr;
//     }

//     public static double[] findAverageMinMax(int[] numbers) {
//         int min = numbers[0], max = numbers[0], sum = 0;
//         for (int n : numbers) {
//             sum += n;
//             if (n < min) min = n;
//             if (n > max) max = n;
//         }
//         double avg = (double) sum / numbers.length;
//         return new double[]{ avg, min, max };
//     }

//     // ---------- MAIN ----------
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Example: Run Factors
//         System.out.print("Enter a number for factors: ");
//         int num = sc.nextInt();
//         int[] factors = findFactors(num);
//         System.out.println("Factors: " + Arrays.toString(factors));
//         System.out.println("Sum: " + sumOfFactors(factors));
//         System.out.println("Product: " + productOfFactors(factors));
//         System.out.println("Sum of squares: " + sumOfSquares(factors));
//     }
// }