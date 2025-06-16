public class SmallestNumberCheck {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        boolean isSmallest = num1 < num2 && num1 < num3;
        System.out.println("Is the first number the smallest? " + isSmallest);
    }
}
