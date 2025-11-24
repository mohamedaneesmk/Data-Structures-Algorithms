package Functions;

import java.util.Scanner;

public class FactorialMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        long result = Factorial(n);
        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            System.out.println("Factorial of " + n + " is: " + result);
        }
        sc.close();
    }
    
    // O(n) time, O(1) space - Iterative approach
    public static long Factorial(int n) {
        if (n < 0) return -1; // Invalid input
        if (n == 0 || n == 1) return 1;
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Alternative: Recursive approach - O(n) time, O(n) space
    public static long FactorialRecursive(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        return n * FactorialRecursive(n - 1);
    }
}