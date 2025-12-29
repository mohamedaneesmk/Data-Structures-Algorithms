import java.util.Arrays;

public class MinimumAbsoluteSumDifference {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        int[] nums1 = {1, 7, 5};
        int[] nums2 = {2, 3, 5};

        int result = minAbsoluteSumDiff(nums1, nums2);
        System.out.println("Minimum Absolute Sum Difference: " + result);
    }

    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;

        // Step 1: Calculate initial sum difference
        long totalDiff = 0;
        for (int i = 0; i < n; i++) {
            totalDiff += Math.abs(nums1[i] - nums2[i]);
        }

        // Step 2: Sort nums1 for binary search
        int[] sorted = nums1.clone();
        Arrays.sort(sorted);

        // Step 3: Find maximum gain possible
        long maxGain = 0;

        for (int i = 0; i < n; i++) {
            int a = nums1[i];
            int b = nums2[i];

            long currentDiff = Math.abs(a - b);

            // Binary search for closest value to b
            int index = Arrays.binarySearch(sorted, b);

            if (index >= 0) {
                // Exact match gives maximum possible gain
                maxGain = Math.max(maxGain, currentDiff);
            } else {
                index = -index - 1;

                // Check right neighbor
                if (index < n) {
                    long newDiff = Math.abs(sorted[index] - b);
                    maxGain = Math.max(maxGain, currentDiff - newDiff);
                }

                // Check left neighbor
                if (index > 0) {
                    long newDiff = Math.abs(sorted[index - 1] - b);
                    maxGain = Math.max(maxGain, currentDiff - newDiff);
                }
            }
        }

        // Step 4: Apply best gain
        return (int) ((totalDiff - maxGain) % MOD);
    }
}
