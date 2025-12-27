public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;
        int result = findSearchIn2DArray(nums, target);
        System.out.println(result);
    }

    private static int findSearchIn2DArray(int[][] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int row = 0;
        int col = nums[0].length - 1;

        while (row < nums.length && col >= 0) {
            if (nums[row][col] == target) {
                return 1; // found
            } else if (nums[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        } 
        return -1; // not found
    }
}
