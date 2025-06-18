import java.util.Scanner;

public class UpperCaseCompare {

    public static String convertToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = sc.nextLine();

        String builtInUpper = input.toUpperCase();
        String customUpper = convertToUpper(input);

        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Custom Uppercase:   " + customUpper);

        boolean isSame = compareStrings(builtInUpper, customUpper);
        System.out.println("Are both results equal? " + isSame);
    }
}
