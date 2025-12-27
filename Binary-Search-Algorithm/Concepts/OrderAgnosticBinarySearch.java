public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 3, 4, 4, 6, 7, 9 };
        int target = 9;

        int result = orderAgnosticBinarySearch(nums, target);
        System.out.println(result);
    }

    private static int orderAgnosticBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        boolean isAscending = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid])
                return mid;

            if (isAscending) {
                if (target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        return -1;
    }
}
