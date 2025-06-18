import java.util.Scanner;

public class VowelReplacer {

    public static String replaceVowels(String input, char symbol) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) {
                result += symbol;
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();
        System.out.println("Enter a symbol to replace vowels:");
        char symbol = sc.next().charAt(0);

        String modified = replaceVowels(text, symbol);
        System.out.println("Modified String: " + modified);
    }
}
