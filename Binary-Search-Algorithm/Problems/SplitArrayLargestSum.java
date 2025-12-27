public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;

        System.out.println(splitArrayLargestSum(nums, k));
    }

    private static int splitArrayLargestSum(int[] nums, int k) {
        int start = 0;
        int end = 0;

        // Define search space
        for (int num : nums) {
            start = Math.max(start, num); // max element
            end = end + num; // sum of the array
        }

        // Binary Search
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (canSplit(nums, k, mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    // Helper function
    private static boolean canSplit(int[] nums, int k, int maxSum) {
        int subArrays = 1;
        int currentSum = 0;

        for (int num : nums) {
            currentSum = currentSum + num;

            if (currentSum > maxSum) {
                subArrays++;
                currentSum = num;

                if (subArrays > k) {
                    return false;
                }
            }
        }

        return true;
    }
}
