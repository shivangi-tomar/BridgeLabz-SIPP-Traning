import java.util.Scanner;
public class MinutesConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total minutes: ");
        int minutes = input.nextInt();
        int hours = minutes / 60;
        int remaining = minutes % 60;
        System.out.println("That is " + hours + " hours and " + remaining + " minutes");
    }
}
