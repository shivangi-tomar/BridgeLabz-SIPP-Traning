import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class WordCounterInFile {
    public static void main(String[] args) {
        String targetWord = "java"; // Word to search (case-insensitive)
        int count = 0;

        try {
            FileReader fr = new FileReader("input.txt"); // File name
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ((line = br.readLine()) != null) {
                // Convert line to lowercase to ignore case
                String[] words = line.toLowerCase().split("\\s+");

                for (String word : words) {
                    // Remove punctuation if needed
                    word = word.replaceAll("[^a-zA-Z]", "");

                    if (word.equals(targetWord.toLowerCase())) {
                        count++;
                    }
                }
            }

            br.close();
            fr.close();

            System.out.println("The word \"" + targetWord + "\" occurred " + count + " times.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
