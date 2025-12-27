class RotationCount {
    public static int rotationCount(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {

            // If array is already sorted
            if (nums[low] <= nums[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;
            int next = (mid + 1) % nums.length;
            int prev = (mid - 1 + nums.length) % nums.length;

            // Check if mid is minimum
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                return mid;
            }

            // Decide which side to go
            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println("Rotation Count = " + rotationCount(arr));
    }
}
