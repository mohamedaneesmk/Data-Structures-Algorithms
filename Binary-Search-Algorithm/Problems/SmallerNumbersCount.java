public class SmallerNumbersCount {
    
    public static void main(String[] args) {
        int[] nums = { 5, 2, 6, 1 };
        int[] result = smallerNumbersCount(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 2 1 1 0
    }

    private static int[] smallerNumbersCount(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n];
        int[] indices = new int[n];
        int[] temp = new int[n];
        
        // Initialize indices
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        
        mergeSort(nums, indices, temp, counts, 0, n - 1);
        
        return counts;
    }
    
    private static void mergeSort(int[] nums, int[] indices, int[] temp, 
                                   int[] counts, int left, int right) {
        if (left >= right) return;
        
        int mid = left + (right - left) / 2;
        mergeSort(nums, indices, temp, counts, left, mid);
        mergeSort(nums, indices, temp, counts, mid + 1, right);
        merge(nums, indices, temp, counts, left, mid, right);
    }
    
    private static void merge(int[] nums, int[] indices, int[] temp, 
                              int[] counts, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        int rightCount = 0; // Count of smaller elements from right half
        
        while (i <= mid && j <= right) {
            if (nums[indices[j]] < nums[indices[i]]) {
                temp[k++] = indices[j++];
                rightCount++;
            } else {
                counts[indices[i]] += rightCount;
                temp[k++] = indices[i++];
            }
        }
        
        // Remaining left elements
        while (i <= mid) {
            counts[indices[i]] += rightCount;
            temp[k++] = indices[i++];
        }
        
        // Remaining right elements
        while (j <= right) {
            temp[k++] = indices[j++];
        }
        
        // Copy back
        System.arraycopy(temp, left, indices, left, right - left + 1);
    }
}