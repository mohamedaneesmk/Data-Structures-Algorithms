public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }

    private static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];
        int duplicate = -1, missing = -1;

        // Count frequencies
        for (int num : nums) {
            freq[num]++;
        }

        // Find duplicate and missing
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicate = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[] { duplicate, missing };
    }
}
