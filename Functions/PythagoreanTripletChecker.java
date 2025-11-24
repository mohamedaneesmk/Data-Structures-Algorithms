package Functions;

import java.util.Scanner;
import java.util.Arrays;

public class PythagoreanTripletChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("The triplet is a Pythagorean triplet");
        } else {
            System.out.println("The triplet is not a Pythagorean triplet");
        }
        sc.close();
    }
    
    // O(1) time complexity (with sorting O(1) for 3 elements)
    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        // Sort the numbers to identify the largest (hypotenuse)
        int[] nums = {a, b, c};
        Arrays.sort(nums);
        
        // Check if a² + b² = c²
        return (nums[0] * nums[0] + nums[1] * nums[1]) == (nums[2] * nums[2]);
    }
    
    // Alternative: Without sorting - checks all combinations
    public static boolean isPythagoreanTripletAlt(int a, int b, int c) {
        return (a * a + b * b == c * c) || 
               (a * a + c * c == b * b) || 
               (b * b + c * c == a * a);
    }
}