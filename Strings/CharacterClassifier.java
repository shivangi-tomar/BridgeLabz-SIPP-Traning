import java.util.Scanner;

public class CharacterClassifier {

    // Method 1: Classify character as Vowel, Consonant, or Not a Letter
    public static String classifyChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert to lowercase using ASCII
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method 2: Process string and classify each character
    public static String[][] processString(String input) {
        int len = input.length();
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = input.charAt(i);
            result[i][0] = Character.toString(ch);
            result[i][1] = classifyChar(ch);
        }
        return result;
    }

    // Method 3: Display 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("----------------------------");
        System.out.println("Char\t|\tType");
        System.out.println("----------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println("  " + data[i][0] + "\t|\t" + data[i][1]);
        }

        System.out.println("----------------------------");
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = processString(input);
        displayTable(result);

        sc.close();
    }
}
