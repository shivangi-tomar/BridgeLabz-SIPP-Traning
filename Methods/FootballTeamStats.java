public class FootballTeamStats {

    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150 to 250
        }
        return heights;
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) if (num < min) min = num;
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) if (num > max) max = num;
        return max;
    }

    public static double findMean(int[] arr) {
        return (double)findSum(arr) / arr.length;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Heights of Players:");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest Height: " + findMin(heights));
        System.out.println("Tallest Height: " + findMax(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
