package Functions;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        checkEvenOdd(num);
        sc.close();
    }
    
    // O(1) time complexity
    public static void checkEvenOdd(int num) {
        if (isEven(num)) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
    
    // Helper method that returns boolean
    public static boolean isEven(int num) {
        return (num & 1) == 0; // Bitwise AND - more efficient than modulo
    }
}