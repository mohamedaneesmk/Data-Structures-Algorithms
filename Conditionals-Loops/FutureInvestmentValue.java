import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investment = sc.nextDouble();
        System.out.print("Enter annual interest rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        
        double futureValue = investment * Math.pow(1 + rate / 100, years);
        System.out.println("Future Investment Value: " + futureValue);
        sc.close();
    }
} 