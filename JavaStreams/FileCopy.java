import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File source = new File("source.txt");
            File dest = new File("destination.txt");

            if (!source.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            fis = new FileInputStream(source);
            fos = new FileOutputStream(dest);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Failed to close streams.");
            }
        }
    }
}
