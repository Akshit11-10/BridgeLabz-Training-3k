
import java.util.*;

public class stringLevel3 {

    // Q1: BMI Calculation
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return Math.round((weight / (heightM * heightM)) * 100.0) / 100.0;
    }

    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        if (bmi <= 24.9) return "Normal";
        if (bmi <= 39.9) return "Overweight";
        return "Obese";
    }

    public static void displayBMI(double[][] data) {
        System.out.println("Person\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < data.length; i++) {
            double bmi = calculateBMI(data[i][0], data[i][1]);
            String status = getBMIStatus(bmi);
            System.out.println((i + 1) + "\t" + data[i][0] + "\t" + data[i][1] + "\t" + bmi + "\t" + status);
        }
    }

    // Q2: Unique characters
    public static char[] findUniqueChars(String text) {
        List<Character> unique = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique.add(ch);
        }
        char[] result = new char[unique.size()];
        for (int i = 0; i < unique.size(); i++) result[i] = unique.get(i);
        return result;
    }

    // Q3: First non-repeating character
    public static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '\0';
    }

    // Q4: Frequency of characters
    public static Map<Character, Integer> charFrequency(String text) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        return freqMap;
    }

    // Q5: Frequency using unique characters
    public static Map<Character, Integer> frequencyUsingUnique(String text) {
        char[] unique = findUniqueChars(text);
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (char ch : unique) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) count++;
            }
            freqMap.put(ch, count);
        }
        return freqMap;
    }

    // Q6: Frequency using nested loops
    public static Map<Character, Integer> frequencyNested(String text) {
        char[] chars = text.toCharArray();
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';
                }
            }
            freqMap.put(chars[i], count);
        }
        return freqMap;
    }

    // Q7: Palindrome check
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = text.charAt(original.length - 1 - i);
        }
        return Arrays.equals(original, reversed);
    }

    // Q8: Anagram check
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }
        return Arrays.equals(freq1, freq2);
    }

    // Q9: Calendar display
    public static void displayCalendar(int month, int year) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) days[1] = 29;

        System.out.println("\n" + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;

        for (int i = 0; i < d0; i++) System.out.print("    ");
        for (int day = 1; day <= days[month - 1]; day++) {
            System.out.printf("%3d ", day);
            if ((day + d0) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    // Q10: Deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) return null;
        String[][] result = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1: BMI
        double[][] bmiData = {{60, 170}, {75, 180}, {50, 160}, {90, 175}, {45, 155}, {68, 165}, {80, 185}, {55, 150}, {72, 178}, {65, 172}};
        displayBMI(bmiData);

    }
}