public class SquareRoot {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(findSquareRoot(num));
    }

    private static int findSquareRoot(int num) {
        if (num == 0 || num == 1)
            return num;

        int left = 0;
        int right = num;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= num / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
