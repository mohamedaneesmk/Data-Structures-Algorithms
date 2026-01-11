import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 29, 10, 14, 37, 13 };
        selectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);

            swap(nums, maxIndex, last);
        }
    }

    private static void swap(int[] nums, int maxIndex, int last) {
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[last];
        nums[last] = temp;
    }

    private static int getMaxIndex(int[] nums, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }

        return max;
    }
}