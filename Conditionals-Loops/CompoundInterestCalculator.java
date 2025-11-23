import java.util.Scanner; 

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time period (years): ");
        double time = sc.nextDouble();
        System.out.print("Enter compounding frequency (times per year): ");
        int n = sc.nextInt();
        
        double amount = principal * Math.pow(1 + (rate / (100 * n)), n * time);
        double ci = amount - principal;
        
        System.out.println("Compound Interest: " + ci);
        System.out.println("Total Amount: " + amount);
        sc.close();
    }
}