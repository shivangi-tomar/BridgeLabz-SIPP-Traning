import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class ReadFileLineByLine {
    public static void main(String[] args) {
        try {
            // Step 1: Create a FileReader object
            FileReader fileReader = new FileReader("input.txt"); // Make sure this file exists in your project directory

            // Step 2: Wrap it in a BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Step 3: Read each line using readLine()
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Step 4: Close the file
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
