package Functions;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        printSum(a, b);
        sc.close();
    }
    
    // O(1) time complexity
    public static void printSum(int a, int b) {
        System.out.println("Sum: " + calculateSum(a, b));
    }
    
    public static int calculateSum(int a, int b) {
        return a + b;
    }
    
    // Generic method for double
    public static double calculateSum(double a, double b) {
        return a + b;
    }
} 