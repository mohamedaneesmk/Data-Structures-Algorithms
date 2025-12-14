public class FindTheNumber {
    public static void main(String[] args) {
        int[] nums = { 18, 12, 8, 14, 56, 94 };
        int target = 58;

        int result = checkTheNumber(nums, target);
        if(result!=-1){
            System.out.println("Item found at index "+result);
        }
        System.out.println("Item not found");
    }

    private static int checkTheNumber(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
