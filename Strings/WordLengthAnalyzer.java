import java.util.Scanner;

public class WordLengthAnalyzer {

    public static void findSmallestAndLargest(String sentence) {
        String[] words = sentence.split(" ");
        String smallest = words[0];
        String largest = words[0];

        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        findSmallestAndLargest(sentence);
    }
}
