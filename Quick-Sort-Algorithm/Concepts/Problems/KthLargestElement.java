import java.util.Random;

class KthLargestElement {
    private Random random = new Random();

    public int findKthLargest(int[] nums, int k) {
        // kth largest is at index k-1 in descending order
        return quickSelect(nums, 0, nums.length - 1, k - 1);
    }

    private int quickSelect(int[] nums, int left, int right, int kIndex) {
        // Base case: only one element
        if (left == right) {
            return nums[left];
        }

        // Random pivot for better average performance
        int pivotIndex = left + random.nextInt(right - left + 1);

        // Partition and get final pivot position
        pivotIndex = partition(nums, left, right, pivotIndex);

        // Check if we found the kth largest
        if (kIndex == pivotIndex) {
            return nums[kIndex];
        } else if (kIndex < pivotIndex) {
            // Search in left partition (larger elements)
            return quickSelect(nums, left, pivotIndex - 1, kIndex);
        } else {
            // Search in right partition (smaller elements)
            return quickSelect(nums, pivotIndex + 1, right, kIndex);
        }
    }

    private int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivot = nums[pivotIndex];

        // Move pivot to end
        swap(nums, pivotIndex, right);

        // Move all elements larger than pivot to the left
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (nums[i] > pivot) {
                swap(nums, i, storeIndex);
                storeIndex++;
            }
        }

        // Move pivot to its final position
        swap(nums, storeIndex, right);

        return storeIndex;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}