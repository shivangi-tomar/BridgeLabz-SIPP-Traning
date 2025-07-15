public class MergeSort {
    public static void main(String[] args) {
        int[] prices = {300, 150, 200, 400, 250};
        mergeSort(prices, 0, prices.length - 1);

        for (int price : prices) {
            System.out.print(price + " ");
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= high) temp[k++] = arr[j++];

        for (int m = 0; m < temp.length; m++) {
            arr[low + m] = temp[m];
        }
    }
}
