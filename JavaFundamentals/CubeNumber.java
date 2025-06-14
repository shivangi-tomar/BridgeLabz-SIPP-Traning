import java.util.Scanner;
public class CubeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Cube of the number is " + (num * num * num));
    }
}
