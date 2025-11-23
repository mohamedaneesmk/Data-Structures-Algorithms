import java.util.Scanner;

public class BattingAverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        int runs = sc.nextInt();
        System.out.print("Enter number of times dismissed: ");
        int dismissals = sc.nextInt();

        if (dismissals == 0) {
            System.out.println("Batting Average: Not Out (No dismissals)");
        } else {
            double average = (double) runs / dismissals;
            System.out.println("Batting Average: " + average);
        }
        sc.close();
    }
}