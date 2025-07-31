import java.io.*;

public class ErrorLineReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("largefile.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (br != null) br.close();
        }
    }
}
