import java.util.Scanner;

public class RemoveDigits {

    public static String removeDigits(String input) {
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String cleaned = removeDigits(input);
        System.out.println("String after removing digits: " + cleaned);
    }
}
