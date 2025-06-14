import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: first number = " + a + ", second number = " + b);
    }
}
