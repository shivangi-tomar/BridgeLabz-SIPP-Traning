import java.io.*;

public class BufferedCopyCompare {
    public static void main(String[] args) {
        String sourcePath = "bigfile.txt";       // replace with your 100MB file
        String destBuffered = "copy_buffered.txt";
        String destUnbuffered = "copy_unbuffered.txt";

        long timeUnbuffered = copyUsingUnbuffered(sourcePath, destUnbuffered);
        long timeBuffered = copyUsingBuffered(sourcePath, destBuffered);

        System.out.println("Unbuffered Copy Time: " + timeUnbuffered + " ns");
        System.out.println("Buffered Copy Time: " + timeBuffered + " ns");
    }

    static long copyUsingUnbuffered(String src, String dest) {
        long start = System.nanoTime();
        try {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("Error in unbuffered copy: " + e.getMessage());
        }
        return System.nanoTime() - start;
    }

    static long copyUsingBuffered(String src, String dest) {
        long start = System.nanoTime();
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bis.close();
            bos.close();
        } catch (IOException e) {
            System.out.println("Error in buffered copy: " + e.getMessage());
        }
        return System.nanoTime() - start;
    }
}
