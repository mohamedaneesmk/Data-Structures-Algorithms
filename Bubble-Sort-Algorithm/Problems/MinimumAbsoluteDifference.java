import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 3 };
        List<List<Integer>> minDiff = findMinimumAbsoluteDifference(arr);
        System.out.println("Minimum Absolute Difference: " + minDiff);
    }

    private static List<List<Integer>> findMinimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr); // Step 1: sort the array
        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        // Step 2: single pass to find minDiff and collect pairs
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
                result.clear(); // reset because we found a smaller diff
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            } else if (diff == minDiff) {
                result.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return result;
    }
}
