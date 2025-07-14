public class SearchWord {
    public static void main(String[] args) {
        String[] sentences = {
            "The sky is blue",
            "Java is powerful",
            "OpenAI creates ChatGPT"
        };
        String word = "Java";
        String result = "Not Found";

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                result = sentences[i];
                break;
            }
        }

        System.out.println("Result: " + result);
    }
}
