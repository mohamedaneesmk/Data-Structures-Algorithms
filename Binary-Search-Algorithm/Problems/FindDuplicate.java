public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 }; // Array containing n + 1 integers where each integer is between 1 and n (inclusive)

        int result = findDuplicate(arr);
        System.out.println(result);
    }

    private static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        // Phase 1: Finding the intersection point in the cycle
        do {
            slow = arr[slow];          // Move slow by one step
            fast = arr[arr[fast]];    // Move fast by two steps
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle
        slow = arr[0]; // Start from the beginning
        while (slow != fast) {
            slow = arr[slow]; // Move one step
            fast = arr[fast]; // Move one step
        }

        return slow; // The duplicate number
    }
}
