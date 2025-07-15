import java.io.*;

public class FileReadCompare {
    public static void main(String[] args) throws Exception {
        long start, end;

        // FileReader
        start = System.currentTimeMillis();
        FileReader fr = new FileReader("test.txt");
        while (fr.read() != -1);
        fr.close();
        end = System.currentTimeMillis();
        System.out.println("FileReader time: " + (end - start) + " ms");

        // InputStreamReader
        start = System.currentTimeMillis();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"));
        while (isr.read() != -1);
        isr.close();
        end = System.currentTimeMillis();
        System.out.println("InputStreamReader time: " + (end - start) + " ms");
    }
}
