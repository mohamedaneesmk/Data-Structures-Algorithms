package Problems;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] result = transposeMatrix(matrix);

        for(int row = 0; row < result.length; row++){
            for(int col = 0; col < result[0].length ; col++){
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                result[col][row] = matrix[row][col];
            }
        }

        return result;
    }
}
