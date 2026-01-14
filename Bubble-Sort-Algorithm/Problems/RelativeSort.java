public class RelativeSort {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
        int[] arr2 = { 2, 1, 4, 3, 9, 6 };

        int[] result = relativeSort(arr1, arr2);

        // Print the sorted array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] relativeSort(int[] arr1, int[] arr2) {
        // Count frequency of each number in arr1
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }

        int index = 0;

        // Place elements of arr2 in the result array first
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        // Place remaining elements in ascending order
        for (int num = 0; num < count.length; num++) {
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }

        return arr1;
    }
}
