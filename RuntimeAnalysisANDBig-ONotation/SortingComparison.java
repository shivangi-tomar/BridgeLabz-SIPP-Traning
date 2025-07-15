public class SortingComparison {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        // Bubble Sort
        int[] bubble = arr.clone();
        for (int i = 0; i < bubble.length - 1; i++) {
            for (int j = 0; j < bubble.length - i - 1; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }

        // Quick Sort
        int[] quick = arr.clone();
        quickSort(quick, 0, quick.length - 1);

        // Merge Sort
        int[] merge = arr.clone();
        mergeSort(merge, 0, merge.length - 1);

        System.out.println("Sorting Done!");
    }

    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            quickSort(a, low, p - 1);
            quickSort(a, p + 1, high);
        }
    }

    static int partition(int[] a, int low, int high) {
        int pivot = a[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i]; a[i] = a[j]; a[j] = temp;
            }
        }
        int temp = a[i + 1]; a[i + 1] = a[high]; a[high] = temp;
        return i + 1;
    }

    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1], R = new int[n2];
        for (int i = 0; i < n1; i++) L[i] = a[l + i];
        for (int i = 0; i < n2; i++) R[i] = a[m + 1 + i];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) a[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }
}
