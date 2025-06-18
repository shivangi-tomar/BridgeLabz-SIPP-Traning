import java.util.Scanner;

public class WordCounter {

    public static int countWords(String sentence) {
        int count = 0;
        boolean word = false;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ' && !word) {
                word = true;
                count++;
            } else if (ch == ' ') {
                word = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        int totalWords = countWords(input);
        System.out.println("Total number of words: " + totalWords);
    }
}
