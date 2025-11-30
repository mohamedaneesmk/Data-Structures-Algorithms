package Problems;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = findRunningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findRunningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            result[i] = nums[i] + sum;
            sum = result[i];
        }

        return result;
    }    
}
