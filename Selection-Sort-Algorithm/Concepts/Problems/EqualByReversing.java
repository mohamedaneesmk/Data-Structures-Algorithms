public class EqualByReversing {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 2, 4, 1, 3 };
        boolean result = canBeEqual(arr1, arr2);
        System.out.println("Can arr1 be made equal to arr2 by reversing a subarray? " + result);
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length) {
            return false;
        }

        // Count frequency of elements
        int[] freq = new int[1001]; // constraint: 1 <= arr[i] <= 1000

        for (int num : target) {
            freq[num]++;
        }

        for (int num : arr) {
            freq[num]--;
        }

        // Check if all frequencies are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}