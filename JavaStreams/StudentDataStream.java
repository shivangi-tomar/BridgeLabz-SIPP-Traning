import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) throws IOException {
        String file = "students.dat";

        // Writing data
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            dos.writeInt(101);
            dos.writeUTF("Shivangi");
            dos.writeDouble(9.2);
        }

        // Reading data
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Roll: " + roll);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);
        }
    }
}
