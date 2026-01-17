import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = { 10, 2 };
        String result = largestNumber(nums);
        System.out.println(result);
    }

    private static String largestNumber(int[] nums) {
        // Convert int[] to String[]
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sort
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If highest value is "0", answer is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build result
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : arr) {
            stringBuilder.append(string);
        }

        return stringBuilder.toString();
    }
}