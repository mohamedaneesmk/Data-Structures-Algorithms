// Buuble Sort Aslo known as Sinking Sort and Exchanging Sort 

public class BubbleSortEasy {
    public static void main(String[] args) {
        // int[] arr = { 5, 3, 4, 1 };
        int[] arr = { 170, 150, 180, 160 };
        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
