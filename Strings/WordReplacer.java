import java.util.Scanner;

public class WordReplacer {

    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" ");
        String result = "";
        for (String word : words) {
            if (word.equals(target)) {
                result += replacement + " ";
            } else {
                result += word + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to replace:");
        String wordToReplace = sc.next();
        System.out.println("Enter the replacement word:");
        String replacementWord = sc.next();

        String updatedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Updated Sentence: " + updatedSentence);
    }
}
