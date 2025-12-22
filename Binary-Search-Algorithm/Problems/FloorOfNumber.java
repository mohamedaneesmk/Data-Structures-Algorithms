// Floor = Greatest element in array Smaller or equals Target

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 }; // Array must be sorted for binary search
        int target = 10;

        int result = floorOfNumber(arr, target);
        System.out.println(result);
    }

    private static int floorOfNumber(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        if (target < arr[low]) 
            return -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == arr[mid])
                return arr[mid];
            else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return arr[high];
    }
}
