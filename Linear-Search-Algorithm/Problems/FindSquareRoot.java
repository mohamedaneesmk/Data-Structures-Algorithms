public class FindSquareRoot {
    public static void main(String[] args) {
        int num = 8;
        int result = findSqrt(num);
        System.out.println(result);        
    }

    private static int findSqrt(int num){
       if (num < 2) return num;

        int left = 1, right = num;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long) mid * mid <= num) {
                ans = mid;        // store possible answer
                left = mid + 1;   // try bigger
            } else {
                right = mid - 1;  // try smaller
            }
        }
        return ans;
    }
}
