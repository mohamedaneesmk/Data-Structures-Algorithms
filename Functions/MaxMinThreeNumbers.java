package Functions;

import java.util.Scanner;

public class MaxMinThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        printMaximum(a, b, c);
        printMinimum(a, b, c);
        sc.close();
    }
    
    // O(1) time complexity
    public static void printMaximum(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum: " + max);
    }
    
    public static void printMinimum(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Minimum: " + min);
    }
    
    // Alternative: Return methods
    public static int getMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static int getMinimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}