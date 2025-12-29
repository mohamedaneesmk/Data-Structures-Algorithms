public class BubbleSortOptimized {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // already sorted
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
