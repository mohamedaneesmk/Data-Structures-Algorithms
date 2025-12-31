public class DivideChocolate {

    public static void main(String[] args) {

        // Example 1
        int[] sweetness1 = {1,2,3,4,5,6,7,8,9};
        int K1 = 5;
        System.out.println(maximizeSweetness(sweetness1, K1)); // Output: 6

        // Example 2
        int[] sweetness2 = {5,6,7,8,9,1,2,3,4};
        int K2 = 8;
        System.out.println(maximizeSweetness(sweetness2, K2)); // Output: 1

        // Example 3
        int[] sweetness3 = {1,2,2,1,2,2,1,2,2};
        int K3 = 2;
        System.out.println(maximizeSweetness(sweetness3, K3)); // Output: 5
    }

    public static int maximizeSweetness(int[] sweetness, int K) {
        int low = Integer.MAX_VALUE;
        int high = 0;

        for (int s : sweetness) {
            low = Math.min(low, s);
            high += s;
        }

        high /= (K + 1);
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canCut(sweetness, K + 1, mid)) {
                ans = mid;
                low = mid + 1;   // try bigger minimum
            } else {
                high = mid - 1;  // try smaller
            }
        }
        return ans;
    }

    private static boolean canCut(int[] arr, int pieces, int minSweet) {
        int sum = 0;
        int count = 0;

        for (int s : arr) {
            sum += s;
            if (sum >= minSweet) {
                count++;
                sum = 0;
            }
        }
        return count >= pieces;
    }
}
