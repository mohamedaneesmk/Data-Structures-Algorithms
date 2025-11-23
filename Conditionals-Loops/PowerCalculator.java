import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        
        System.out.println("Result: " + power(base, exp));
        sc.close();
    }
    
    // Optimized using binary exponentiation - O(log n) time
    public static long power(int base, int exp) {
        if (exp < 0) return 0; // For simplicity
        
        long result = 1;
        long b = base;
        int e = exp;
        
        while (e > 0) {
            if ((e & 1) == 1) {
                result *= b;
            }
            b *= b;
            e >>= 1;
        }
        return result;
    }
}