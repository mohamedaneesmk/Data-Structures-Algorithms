import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        
        System.out.println("Distance: " + calculateDistance(x1, y1, x2, y2));
        sc.close();
    }
    
    // Euclidean distance - O(1) time
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}