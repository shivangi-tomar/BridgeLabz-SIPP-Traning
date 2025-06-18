import java.util.Scanner;

public class ReplaceJavaWithPython {

    public static String replaceJava(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            if (word.equals("java")) {
                result += "python ";
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

        String modified = replaceJava(sentence);
        System.out.println("Modified Sentence: " + modified);
    }
}
