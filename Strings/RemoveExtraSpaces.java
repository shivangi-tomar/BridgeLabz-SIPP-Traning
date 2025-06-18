import java.util.Scanner;

public class RemoveExtraSpaces {

    public static String removeSpaces(String input) {
        String trimmed = input.trim();
        String result = "";

        boolean spaceFound = false;

        for (int i = 0; i < trimmed.length(); i++) {
            char ch = trimmed.charAt(i);

            if (ch == ' ') {
                if (!spaceFound) {
                    result += ch;
                    spaceFound = true;
                }
            } else {
                result += ch;
                spaceFound = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text with extra spaces:");
        String input = sc.nextLine();

        String output = removeSpaces(input);
        System.out.println("Cleaned text: '" + output + "'");
    }
}
