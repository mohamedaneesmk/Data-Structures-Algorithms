package Functions;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        System.out.println("Sum of first " + n + " natural numbers: " + sumOfNaturalNumbers(n));
        sc.close();
    }
    
    // Optimized O(1) time complexity using formula
    public static long sumOfNaturalNumbers(int n) {
        if (n < 0) return 0;
        return (long) n * (n + 1) / 2;
    }
    
    // Alternative: Iterative approach - O(n) time
    public static long sumOfNaturalNumbersIterative(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    // Alternative: Recursive approach - O(n) time, O(n) space
    public static long sumOfNaturalNumbersRecursive(int n) {
        if (n <= 0) return 0;
        return n + sumOfNaturalNumbersRecursive(n - 1);
    }
}