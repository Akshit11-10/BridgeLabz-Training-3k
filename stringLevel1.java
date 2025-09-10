import java.util.*;

public class stringLevel1 {

    // Method 1: Compare two strings using charAt()
    public static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    // Method 2: Create substring using charAt()
    public static String substringCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    // Method 3: Convert string to char array manually
    public static char[] manualToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    // Method 4: Compare two char arrays
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Method 5: Generate NullPointerException
    public static void generateNullPointer() {
        String text = null;
        System.out.println(text.length()); // Will throw exception
    }

    public static void handleNullPointer() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    // Method 6: Generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBounds(String text) {
        System.out.println(text.charAt(text.length())); // Invalid index
    }

    public static void handleStringIndexOutOfBounds(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    // Method 7: Generate IllegalArgumentException
    public static void generateIllegalArgument(String text) {
        System.out.println(text.substring(5, 2)); // Invalid range
    }

    public static void handleIllegalArgument(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e);
        }
    }

    // Method 8: Generate NumberFormatException
    public static void generateNumberFormat(String text) {
        System.out.println(Integer.parseInt(text)); // Non-numeric input
    }

    public static void handleNumberFormat(String text) {
        try {
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        }
    }

    // Method 9: Generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBounds(String[] names) {
        System.out.println(names[names.length]); // Invalid index
    }

    public static void handleArrayIndexOutOfBounds(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        }
    }

    // Method 10: Convert to uppercase manually
    public static String manualToUpperCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    // Method 11: Convert to lowercase manually
    public static String manualToLowerCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example usage: Compare strings
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        boolean result = compareStringsCharAt(s1, s2);
        System.out.println("User-defined comparison: " + result);
        System.out.println("Built-in equals(): " + s1.equals(s2));

        // Example usage: Substring comparison
        System.out.print("Enter text: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String sub1 = substringCharAt(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("User-defined substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Are substrings equal: " + compareStringsCharAt(sub1, sub2));

        // You can uncomment and test other methods similarly
        // handleNullPointer();
        // handleStringIndexOutOfBounds("hello");
        // handleIllegalArgument("example");
        // handleNumberFormat("abc123");
        // handleArrayIndexOutOfBounds(new String[]{"Alice", "Bob"});
    }
}