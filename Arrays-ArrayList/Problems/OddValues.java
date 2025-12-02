package Problems;

public class OddValues {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = { { 0, 1 }, { 1, 1 } };

        int result = findOddCells(m, n, indices);
        System.out.println(result);
    }

    private static int findOddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];

        // Count increments for rows and columns
        for (int[] index : indices) {
            row[index[0]]++;
            col[index[1]]++;
        }

        int oddCount = 0;
        // Check each cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((row[i] + col[j]) % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
