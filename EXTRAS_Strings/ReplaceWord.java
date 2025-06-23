public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is good. Java is powerful.";
        String oldWord = "Java";
        String newWord = "Python";
        String result = "";

        int i = 0;
        while (i < sentence.length()) {
            if (i + oldWord.length() <= sentence.length() &&
                sentence.substring(i, i + oldWord.length()).equals(oldWord)) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }

        System.out.println("Modified Sentence: " + result);
    }
}
