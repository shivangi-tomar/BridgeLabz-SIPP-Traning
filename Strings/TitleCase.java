import java.util.Scanner;

public class TitleCase {

    public static String toTitleCase(String text) {
        String result = "";
        boolean capitalize = true;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                result += ch;
                capitalize = true;
            } else {
                if (capitalize && ch >= 'a' && ch <= 'z') {
                    result += (char)(ch - 32);
                } else if (!capitalize && ch >= 'A' && ch <= 'Z') {
                    result += (char)(ch + 32);
                } else {
                    result += ch;
                }
                capitalize = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        String output = toTitleCase(input);
        System.out.println("Title case: " + output);
    }
}
