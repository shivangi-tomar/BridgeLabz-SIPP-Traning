public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000); // 1000 to 9999
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        System.out.print("Generated numbers: ");
        for (int num : nums) System.out.print(num + " ");
        System.out.println();

        double[] stats = findAverageMinMax(nums);
        System.out.println("Average: " + stats[0]);
        System.out.println("Min: " + (int)stats[1]);
        System.out.println("Max: " + (int)stats[2]);
    }
}
