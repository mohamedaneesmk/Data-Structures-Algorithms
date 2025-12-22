public class PeakIndexMountainArray {
    public static void main(String[] args) {
        // int[] arr = {0, 1, 0};
        int[] arr = {1, 2, 3, 4, 5, 7, 6, 5, 4, 3, 2, 1};
        int result = findPeakIndexMountainArray(arr); 
        System.out.println(result); 
    }

    private static int findPeakIndexMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                // Peak is on the right side
                low = mid + 1;
            } else {
                // Peak is on the left side (including mid)
                high = mid;
            }
        }
        
        return low; // or high, since low == high
    }
}
