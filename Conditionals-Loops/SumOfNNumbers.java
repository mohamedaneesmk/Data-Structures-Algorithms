import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            sum += sc.nextInt();
        }
        
        System.out.println("Sum: " + sum);
        sc.close();
    }
    
    // Alternative: Sum of first N natural numbers - O(1)
    public static int sumOfFirstN(int n) {
        return n * (n + 1) / 2;
    }
}  