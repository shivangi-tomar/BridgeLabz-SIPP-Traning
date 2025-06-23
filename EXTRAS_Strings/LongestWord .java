public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        String[] words = sentence.split(" ");
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length())
                longest = words[i];
        }

        System.out.println("Longest word: " + longest);
    }
}
