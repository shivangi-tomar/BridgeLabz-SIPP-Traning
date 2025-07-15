import java.util.*;

public class SearchDSCompare {
    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = 99999;

        // Array Search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        System.out.println("Array Found: " + found);
        System.out.println("HashSet Found: " + hashSet.contains(target));
        System.out.println("TreeSet Found: " + treeSet.contains(target));
    }
}
