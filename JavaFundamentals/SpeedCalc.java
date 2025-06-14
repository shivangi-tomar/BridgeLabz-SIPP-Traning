import java.util.Scanner;
public class SpeedCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance (km): ");
        double distance = input.nextDouble();
        System.out.print("Enter time (hours): ");
        double time = input.nextDouble();
        double speed = distance / time;
        System.out.println("The speed is " + speed + " km/h");
    }
}
