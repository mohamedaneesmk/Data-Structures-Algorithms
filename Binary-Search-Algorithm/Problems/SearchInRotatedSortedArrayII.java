public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 6;

        System.out.println(searchInRotatedSortedArrayII(nums, target));
    }

    private static boolean searchInRotatedSortedArrayII(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Case 1 : Duplicates block decision
            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                start++;
                end--;
            }

            // Case 2 : Left Half is sorted
            else if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Case 3 : Right Half is sorted
            else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}
