public class NumberSignCheck {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
