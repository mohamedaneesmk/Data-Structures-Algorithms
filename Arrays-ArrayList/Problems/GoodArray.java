package Problems;

class GoodArray {
    public boolean isGoodArray(int[] nums) {
        // An array is "good" if we can select a subset and multiply each by 
        // an integer to get sum = 1. By Bézout's identity, this is possible
        // if and only if GCD of all elements equals 1.
        
        int gcd = nums[0];
        
        // Compute GCD of all elements
        for (int i = 1; i < nums.length; i++) {
            gcd = computeGCD(gcd, nums[i]);
            
            // Early termination: if GCD is already 1, no need to continue
            if (gcd == 1) {
                return true;
            }
        }
        
        return gcd == 1;
    }
    
    // Helper method to compute GCD of two numbers using Euclidean algorithm
    private int computeGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Main method for testing
    public static void main(String[] args) {
        GoodArray solution = new GoodArray();
        
        // Test Case
        int[] nums1 = {12, 5, 7, 23};
        System.out.println("Test Case 1:");
        System.out.println("Input: [12, 5, 7, 23]");
        System.out.println("Output: " + solution.isGoodArray(nums1));
        System.out.println("Expected: true");
        System.out.println("Explanation: 5*3 + 7*(-2) = 15 - 14 = 1");
        System.out.println();
    }
}