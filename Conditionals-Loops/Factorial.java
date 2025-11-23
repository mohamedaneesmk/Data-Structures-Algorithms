/*import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
        scanner.close();
    }
}
*/ 

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.println("Factorial: " + factorial(n));
        sc.close();
    }
    
    // Iterative approach - O(n) time, O(1) space
    public static long factorial(int n) {
        if (n < 0) return -1; // Invalid input
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}