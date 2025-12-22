public class InfiniteArraySearch {
    
    // Main method to find position in infinite array
    public static int findPosition(int[] arr, int target) {
        // Step 1: Find the range where target might exist
        int low = 0;
        int high = 1;
        
        // Exponentially increase the range until arr[high] >= target
        // This ensures we find a boundary in O(log n) time
        // Also handle array bounds to simulate infinite array behavior
        while (high < arr.length && arr[high] < target) {
            low = high;
            high = high * 2;  // Double the high pointer
        }
        
        // Adjust high if it exceeds array length
        if (high >= arr.length) {
            high = arr.length - 1;
        }
        
        // Step 2: Perform binary search in the found range
        return binarySearch(arr, target, low, high);
    }
    
    // Standard binary search within given range
    private static int binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Avoid overflow
            
            if (arr[mid] == target) {
                return mid;  // Element found
            } else if (arr[mid] < target) {
                low = mid + 1;  // Search in right half
            } else {
                high = mid - 1;  // Search in left half
            }
        }
        
        return -1;  // Element not found
    }
    
    // Test the implementation
    public static void main(String[] args) {
        // Simulating an infinite sorted array
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 
                     31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55};
        
        // Test cases
        int[] testTargets = {7, 25, 1, 55, 100};
        
        System.out.println("Finding elements in infinite sorted array:");
        System.out.println("Array (first 28 elements): [1, 3, 5, 7, 9, ...]");
        System.out.println();
        
        for (int target : testTargets) {
            int position = findPosition(arr, target);
            if (position != -1) {
                System.out.println("Element " + target + " found at index: " + position);
            } else {
                System.out.println("Element " + target + " not found in array");
            }
        }
    }
}