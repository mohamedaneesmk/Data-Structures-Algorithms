package Problems;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        int[][] result = flipAndInvertImage(image);

        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;

        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < (n + 1) / 2; col++) {
                // Swap and invert simultaneously
                int temp = image[row][col] ^ 1;
                image[row][col] = image[row][n - col - 1] ^ 1;
                image[row][n - col - 1] = temp;
            }
        }

        return image;
    }
}
