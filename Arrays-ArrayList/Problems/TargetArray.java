package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] result = createTargetArray(nums, index);
        System.out.println(Arrays.toString(result));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        System.out.println(target);

        int[] result = new int[nums.length];
        
        for (int i = 0; i < target.size(); i++) {
            result[i] = target.get(i);
        }
        
        return result;
    }
}
