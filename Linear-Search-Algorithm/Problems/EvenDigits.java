public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findEvenDigits(nums));
    }

    private static int findEvenDigits(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (digits(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int digits(int num) {
        if (num == 0) return 1;
        return (int) Math.log10(Math.abs(num)) + 1;
    }
}
