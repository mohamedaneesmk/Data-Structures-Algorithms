import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        System.out.println("Sum of digits: " + sumOfDigits(Math.abs(num)));
        sc.close();
    }
    
    // O(log n) time - number of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    
    // Alternative: Recursive approach
    public static int sumOfDigitsRecursive(int num) {
        return num == 0 ? 0 : (num % 10) + sumOfDigitsRecursive(num / 10);
    }
} 