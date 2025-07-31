import java.io.*;

public class UpperToLowerFileConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("input.txt"));
            bw = new BufferedWriter(new FileWriter("output.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }

            System.out.println("File converted successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (br != null) br.close();
            if (bw != null) bw.close();
        }
    }
}
