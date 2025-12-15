public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };

        // System.out.println(matrix.length); -> Gives number of rows
        // System.out.println(matrix[0].length); -> Gives the inner elements in each row

        int richestWealth = findRichestCustomerWealth(matrix);
        System.out.println(richestWealth);
    }

    private static int findRichestCustomerWealth(int[][] matrix) {
        int maxWealth = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length; row++) {
            int sum = 0; // Reset sum for each customer (row)

            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }

            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}