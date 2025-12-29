public class MaximumValue {
    public static void main(String[] args) {
        int n = 4;
        int index = 2;
        int maxSum = 6;
        System.out.println(maxValue(n, index, maxSum));
    }

    public static int maxValue(int n, int index, int maxSum) {
        int low = 1, high = maxSum;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (requiredSum(mid, n, index) <= maxSum) {
                low = mid + 1; // try higher value
            } else {
                high = mid - 1; // reduce value
            }
        }
        return high;
    }

    private static long requiredSum(int x, int n, int index) {
        long sum = x;

        // left side
        sum += calcSide(x - 1, index);

        // right side
        sum += calcSide(x - 1, n - index - 1);

        return sum;
    }

    private static long calcSide(int peak, int length) {
        if (peak >= length) {
            // full decreasing sequence
            return (long) (peak + (peak - length + 1)) * length / 2;
        } else {
            // hits 1 and stays there
            return (long) (peak + 1) * peak / 2 + (length - peak);
        }
    }
}
