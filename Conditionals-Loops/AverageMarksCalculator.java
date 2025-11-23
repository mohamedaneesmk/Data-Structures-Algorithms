import java.util.Scanner;

public class AverageMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        
        int totalMarks = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            totalMarks += sc.nextInt();
        }
        
        double average = (double) totalMarks / n;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + (average) + "%");
        sc.close();
    }
}