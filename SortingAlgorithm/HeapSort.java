public class HeapSort {
    public static void main(String[] args) {
        int[] salary = {30000, 25000, 40000, 20000, 35000};
        int n = salary.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salary, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = salary[0];
            salary[0] = salary[i];
            salary[i] = temp;

            heapify(salary, i, 0);
        }

        for (int s : salary) {
            System.out.print(s + " ");
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}
