public class KthMissingNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int k = 2;
        int result = findKthMissingNumber(nums, k);

        System.out.println(result);
    }

    private static int findKthMissingNumber(int[] nums, int k) {
        int left = 0; 
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = nums[mid] - (mid + 1);

            if (missing < k)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return left + k;
    }
}
