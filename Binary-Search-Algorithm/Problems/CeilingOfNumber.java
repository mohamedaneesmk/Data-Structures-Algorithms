// Ceiling = Smallest element in array Greater or equals Target

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 }; // Array must be sorted for binary search
        int target = 4;

        int result = ceilingOfNumber(arr, target);
        System.out.println(result);
    }

    private static int ceilingOfNumber(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        // If target is greater than the largest element
        if (target > nums[high]) {
            return -1;
        }

        while (low <= high) { 
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return nums[mid]; // Found exact match
            } else if (nums[mid] < target) {
                low = mid + 1; // Search in right half
            } else {
                high = mid - 1; // Search in left half
            }
        }

        // After loop, low points to the ceiling element
        return nums[low];
    }
}