import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IncreasingFrequency {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3 };
        int[] result = canMakeFrequencyIncreasing(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] canMakeFrequencyIncreasing(int[] nums) {
        // Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Convert to Integer array for sorting
        Integer[] numsObj = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsObj[i] = nums[i];
        }

        // Sort with custom comparator
        Arrays.sort(numsObj, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);

            if (freqA != freqB) {
                return freqA - freqB; // ascending by frequency
            }
            return b - a; // descending by value
        });

        // Convert back to int array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsObj[i];
        }

        return nums;
    }
}
