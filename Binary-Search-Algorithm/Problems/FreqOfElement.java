import java.util.Arrays;

public class FreqOfElement {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 4, 5 }; // Array must be sorted for binary search
        int target = 2;

        int frequency = maxFrequency(arr, target);
        System.out.println(frequency);
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0;
        int left = 0;
        int maxFreq = 1;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Shrink window if operations exceed k
            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }

            // Update Max Frequency
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
