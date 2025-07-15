public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {70, 85, 60, 90, 75};
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[min]) {
                    min = j;
                }
            }
            int temp = scores[i];
            scores[i] = scores[min];
            scores[min] = temp;
        }

        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
