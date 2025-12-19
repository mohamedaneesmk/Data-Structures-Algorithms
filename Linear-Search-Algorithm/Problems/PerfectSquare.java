public class PerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }

    private static boolean isPerfectSquare(int num) {
        if (num < 2)
            return true;

        long low = 2;
        long high = num / 2;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;

            if (num == square)
                return true;
            else if (num > square)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }
}
