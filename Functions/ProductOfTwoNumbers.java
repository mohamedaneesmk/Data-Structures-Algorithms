package Functions;

import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = getProduct(a, b);
        System.out.println("Product: " + result);
        sc.close();
    }
    
    // O(1) time complexity
    public static int getProduct(int a, int b) {
        return a * b;
    }
    
    // Overloaded method for double
    public static double getProduct(double a, double b) {
        return a * b;
    }
    
    // Overloaded method for long
    public static long getProduct(long a, long b) {
        return a * b;
    }
}