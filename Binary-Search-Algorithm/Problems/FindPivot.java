public class FindPivot {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr)); // Output: 3
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid-1 is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: Left side is sorted → pivot on right
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            }
            // Case 4: Right side is sorted → pivot on left
            else {
                end = mid - 1;
            }
        }
        return -1; // array not rotated
    }
}
