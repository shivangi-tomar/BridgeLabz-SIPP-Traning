import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("textfile.txt"));
            Map<String, Integer> wordCount = new HashMap<>();
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> list = new ArrayList<>(wordCount.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                    return e2.getValue() - e1.getValue();
                }
            });

            System.out.println("Top 5 words:");
            for (int i = 0; i < Math.min(5, list.size()); i++) {
                Map.Entry<String, Integer> entry = list.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (br != null) br.close();
        }
    }
}
