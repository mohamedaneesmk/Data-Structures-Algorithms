import java.util.Scanner;

public class NCRandNPRCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        
        if (r > n) {
            System.out.println("Invalid input: r cannot be greater than n");
        } else {
            System.out.println("nPr = " + nPr(n, r));
            System.out.println("nCr = " + nCr(n, r));
        } 
        sc.close();
    }
    
    // Optimized nCr - O(r) time
    public static long nCr(int n, int r) {
        if (r > n - r) r = n - r; // Optimization
        long result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
    
    // nPr using nCr - O(r) time
    public static long nPr(int n, int r) {
        return nCr(n, r) * factorial(r);
    }
    
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}