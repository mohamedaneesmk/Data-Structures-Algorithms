public class FindMinimum {
    public static void main(String[] args) {
        int[] nums = { 6, 3, 8, 1, 6, 6, 4, 4, 7, 9 };
        int result = findMinimum(nums);
        System.out.println(result);
    }

    private static int findMinimum(int[] nums) {
        int minNum = Integer.MAX_VALUE; 
        for (int num : nums) {
            if (num < minNum) {
                minNum = num;
            }
        }

        return minNum;
    }
}
