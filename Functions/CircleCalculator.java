package Functions;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        
        printCircleProperties(radius);
        sc.close();
    }
    
    // O(1) time complexity
    public static void printCircleProperties(double radius) {
        System.out.println("Circumference: " + calculateCircumference(radius));
        System.out.println("Area: " + calculateArea(radius));
    }
    
    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Alternative: Return both values as array
    public static double[] getCircleProperties(double radius) {
        return new double[]{calculateCircumference(radius), calculateArea(radius)};
    }
}