import java.util.*;

public class stringLevel2 {

    // Q1: Length without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    // Q2: Split without split()
    public static String[] manualSplit(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(ch);
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }

    // Q3: Words with length
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    // Q4: Shortest and longest word
    public static String[] findShortestAndLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (getLength(word) < getLength(shortest)) shortest = word;
            if (getLength(word) > getLength(longest)) longest = word;
        }
        return new String[]{shortest, longest};
    }

    // Q5: Count vowels and consonants
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < getLength(text); i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    // Q6: Character classification
    public static String[][] classifyCharacters(String text) {
        List<String[]> result = new ArrayList<>();
        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            String type;
            if (Character.isLetter(ch)) {
                type = "aeiouAEIOU".indexOf(ch) != -1 ? "Vowel" : "Consonant";
            } else {
                type = "Not a Letter";
            }
            result.add(new String[]{String.valueOf(ch), type});
        }
        return result.toArray(new String[0][0]);
    }

    // Q7: Trim using charAt()
    public static String manualTrim(String text) {
        int start = 0, end = getLength(text) - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(text.charAt(i));
        return sb.toString();
    }

    // Q8: Voting eligibility
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    // Q9: Rock-Paper-Scissors
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) return "User";
        return "Computer";
    }

    // Q10: Student grading system
    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = rand.nextInt(100);
            marks[i][1] = rand.nextInt(100);
            marks[i][2] = rand.nextInt(100);
        }
        return marks;
    }

    public static String[] calculateGrade(double percentage) {
        if (percentage >= 80) return new String[]{"A", "Level 4"};
        if (percentage >= 70) return new String[]{"B", "Level 3"};
        if (percentage >= 60) return new String[]{"C", "Level 2"};
        if (percentage >= 50) return new String[]{"D", "Level 1"};
        if (percentage >= 40) return new String[]{"E", "Level 1-"};
        return new String[]{"R", "Remedial"};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1
        System.out.println("Length: " + getLength("hello world"));

        // Q2
        String[] words = manualSplit("Java is awesome");
        System.out.println("Words: " + Arrays.toString(words));

        // Q3
        String[][] wordLengths = wordsWithLength(words);
        System.out.println("Words with lengths:");
        for (String[] pair : wordLengths) System.out.println(pair[0] + " - " + pair[1]);

        // Q4
        String[] extremes = findShortestAndLongest(words);
        System.out.println("Shortest: " + extremes[0] + ", Longest: " + extremes[1]);

        // Q5
        int[] vc = countVowelsConsonants("Java Programming");
        System.out.println("Vowels: " + vc[0] + ", Consonants: " + vc[1]);

        // Q6
        String[][] classified = classifyCharacters("Java123");
        System.out.println("Character Classification:");
        for (String[] pair : classified) System.out.println(pair[0] + " - " + pair[1]);

        // Q7
        System.out.println("Trimmed: '" + manualTrim("   Hello World   ") + "'");

        // Q8
        int[] ages = generateAges(10);
        String[][] eligibility = checkVotingEligibility(ages);
        System.out.println("Voting Eligibility:");
        for (String[] pair : eligibility) System.out.println("Age " + pair[0] + ": " + pair[1]);

        // Q9
        String user = "rock";
        String computer = getComputerChoice();
        System.out.println("User: " + user + ", Computer: " + computer);
        System.out.println("Winner: " + getWinner(user, computer));

        // Q10
        int[][] marks = generateMarks(5);
        System.out.println("Student Grades:");
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percent = total / 3.0;
            String[] grade = calculateGrade(percent);
            System.out.println("Student " + (i + 1) + ": " + percent + "% - Grade " + grade[0] + " (" + grade[1] + ")");
        }
    }
}