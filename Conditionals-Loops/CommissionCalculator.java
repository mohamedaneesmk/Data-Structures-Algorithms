import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();
        System.out.print("Enter commission percentage: ");
        double rate = sc.nextDouble();
        
        double commission = (sales * rate) / 100;
        System.out.println("Commission: " + commission);
        sc.close();
    }
}