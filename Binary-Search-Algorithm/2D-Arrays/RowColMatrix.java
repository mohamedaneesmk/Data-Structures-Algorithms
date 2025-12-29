import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50 }
        };

        int target = 55;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    private static long[] search(int[][] arr, int target) {
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) {
                return new long[]{row, col};
            } else if (arr[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return new long[]{-1, -1};
    }
}
