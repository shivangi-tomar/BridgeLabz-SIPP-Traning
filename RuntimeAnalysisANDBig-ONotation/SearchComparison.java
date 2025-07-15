public class SearchComparison {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) arr[i] = i + 1;

        int target = 9999;

        // Linear Search
        int linearIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                linearIndex = i;
                break;
            }
        }

        // Binary Search
        int low = 0, high = arr.length - 1, binaryIndex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                binaryIndex = mid;
                break;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        System.out.println("Linear Search Index: " + linearIndex);
        System.out.println("Binary Search Index: " + binaryIndex);
    }
}
