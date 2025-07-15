public class CountingSort {
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 12, 17, 11};
        int max = 18;
        int min = 10;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages) {
            count[age - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        for (int age : output) {
            System.out.print(age + " ");
        }
    }
}
