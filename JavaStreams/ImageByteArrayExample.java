import java.io.*;

public class ImageByteArrayExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("original.jpg");
            baos = new ByteArrayOutputStream();

            int b;
            while ((b = fis.read()) != -1) {
                baos.write(b);
            }

            byte[] imageBytes = baos.toByteArray();

            fos = new FileOutputStream("copy.jpg");
            fos.write(imageBytes);

            System.out.println("Image copied successfully....");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (fis != null) fis.close();
            if (baos != null) baos.close();
            if (fos != null) fos.close();
        }
    }
}
