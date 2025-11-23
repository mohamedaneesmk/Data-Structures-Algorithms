import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial value: ");
        double value = sc.nextDouble();
        System.out.print("Enter depreciation rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time period (years): ");
        int years = sc.nextInt();
        
        double finalValue = value * Math.pow(1 - rate / 100, years);
        System.out.println("Depreciated Value: " + finalValue);
        System.out.println("Total Depreciation: " + (value - finalValue));
        sc.close();
    }
}