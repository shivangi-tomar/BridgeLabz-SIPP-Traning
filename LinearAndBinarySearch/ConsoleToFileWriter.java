import java.io.*;

public class ConsoleToFileWriter {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            FileWriter fw = new FileWriter("user_input.txt");

            String input;
            System.out.println("Type something (type 'exit' to finish):");

            while (true) {
                input = br.readLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                fw.write(input + "\n"); // Write to file with new line
            }

            fw.close();
            br.close();
            isr.close();

            System.out.println("Your input has been saved to 'user_input.txt'.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
