// import java.util.Scanner;

// public class MethodsLevel1 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Example: Call any method here to test
//         calculateSimpleInterest(sc);
//         calculateHandshakes(sc);
//         calculateRounds(sc);
//         checkNumberSign(sc);
//         checkSpringSeason(sc);
//         sumNaturalNumbers(sc);
//         findSmallestAndLargest(sc);
//         findRemainderAndQuotient(sc);
//         divideChocolates(sc);
//         calculateWindChill(sc);
//         calculateTrigonometricFunctions(sc);

//         sc.close();
//     }

//     public static void calculateSimpleInterest(Scanner sc) {
//         System.out.print("Enter Principal: ");
//         double principal = sc.nextDouble();
//         System.out.print("Enter Rate of Interest: ");
//         double rate = sc.nextDouble();
//         System.out.print("Enter Time (in years): ");
//         double time = sc.nextDouble();

//         double interest = principal * rate * time / 100;
//         System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
//     }

//     public static void calculateHandshakes(Scanner sc) {
//         System.out.print("Enter number of students: ");
//         int n = sc.nextInt();
//         int handshakes = (n * (n - 1)) / 2;
//         System.out.println("Maximum number of handshakes: " + handshakes);
//     }

//     public static void calculateRounds(Scanner sc) {
//         System.out.print("Enter side A of triangle (in meters): ");
//         double a = sc.nextDouble();
//         System.out.print("Enter side B of triangle (in meters): ");
//         double b = sc.nextDouble();
//         System.out.print("Enter side C of triangle (in meters): ");
//         double c = sc.nextDouble();

//         double perimeter = a + b + c;
//         int rounds = (int) Math.ceil(5000 / perimeter);
//         System.out.println("Number of rounds to complete 5km: " + rounds);
//     }

//     public static void checkNumberSign(Scanner sc) {
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int result = (num > 0) ? 1 : (num < 0) ? -1 : 0;
//         System.out.println("Result: " + result);
//     }

//     public static void checkSpringSeason(Scanner sc) {
//         System.out.print("Enter month (1-12): ");
//         int month = sc.nextInt();
//         System.out.print("Enter day: ");
//         int day = sc.nextInt();

//         boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
//         System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
//     }

//     public static void sumNaturalNumbers(Scanner sc) {
//         System.out.print("Enter n: ");
//         int n = sc.nextInt();
//         int sum = 0;
//         for (int i = 1; i <= n; i++) sum += i;
//         System.out.println("Sum of first " + n + " natural numbers is: " + sum);
//     }

//     public static void findSmallestAndLargest(Scanner sc) {
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();

//         int smallest = Math.min(a, Math.min(b, c));
//         int largest = Math.max(a, Math.max(b, c));
//         System.out.println("Smallest: " + smallest + ", Largest: " + largest);
//     }

//     public static void findRemainderAndQuotient(Scanner sc) {
//         System.out.print("Enter number: ");
//         int number = sc.nextInt();
//         System.out.print("Enter divisor: ");
//         int divisor = sc.nextInt();

//         int quotient = number / divisor;
//         int remainder = number % divisor;
//         System.out.println("Quotient: " + quotient + ", Remainder: " + remainder);
//     }

//     public static void divideChocolates(Scanner sc) {
//         System.out.print("Enter number of chocolates: ");
//         int chocolates = sc.nextInt();
//         System.out.print("Enter number of children: ");
//         int children = sc.nextInt();

//         int each = chocolates / children;
//         int remaining = chocolates % children;
//         System.out.println("Each child gets: " + each + ", Remaining chocolates: " + remaining);
//     }

//     public static void calculateWindChill(Scanner sc) {
//         System.out.print("Enter temperature (in Fahrenheit): ");
//         double temp = sc.nextDouble();
//         System.out.print("Enter wind speed (in mph): ");
//         double windSpeed = sc.nextDouble();

//         double windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
//         System.out.println("Wind Chill Temperature: " + windChill);
//     }

//     public static void calculateTrigonometricFunctions(Scanner sc) {
//         System.out.print("Enter angle in degrees: ");
//         double angle = sc.nextDouble();
//         double radians = Math.toRadians(angle);

//         double sine = Math.sin(radians);
//         double cosine = Math.cos(radians);
//         double tangent = Math.tan(radians);

//         System.out.println("Sine: " + sine + ", Cosine: " + cosine + ", Tangent: " + tangent);
//     }
// }