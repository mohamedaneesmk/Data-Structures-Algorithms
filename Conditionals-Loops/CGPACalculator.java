import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        
        double totalGrade = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            totalGrade += sc.nextDouble();
        }
        
        double cgpa = totalGrade / n;
        System.out.println("CGPA: " + cgpa);
        sc.close();
    }
}