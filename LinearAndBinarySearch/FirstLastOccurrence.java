public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 8, 10};
        int target = 4;
        int first = -1, last = -1;

        // First Occurrence
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        // Last Occurrence
        left = 0; right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
