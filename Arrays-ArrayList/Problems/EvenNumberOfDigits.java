package Problems;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = { 555, 901, 482, 1771 };
        System.out.println(findEvenNumberOfDigits(nums));
    } 

    private static int findEvenNumberOfDigits(int[] nums) {
        int evenDigitCount = 0;

        for (int num : nums) {
            // Absolute value handles negative numbers
            int digits = (int) Math.log10(Math.abs(num)) + 1;

            if (digits % 2 == 0) {
                evenDigitCount++;
            }
        }

        return evenDigitCount;
    }
}
