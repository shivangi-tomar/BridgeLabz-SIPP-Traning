public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, -1, 4, -9};
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("First negative number at index: " + index);
        } else {
            System.out.println("No negative number found.");
        }
    }
}
