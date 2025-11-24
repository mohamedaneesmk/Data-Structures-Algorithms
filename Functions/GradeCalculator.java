package Functions;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (out of 100): ");
        int marks = sc.nextInt();
        
        displayGrade(marks);
        sc.close();
    }
    
    // O(1) time complexity
    public static void displayGrade(int marks) {
        String grade = getGrade(marks);
        System.out.println("Grade: " + grade);
    }
    
    public static String getGrade(int marks) {
        if (marks < 0 || marks > 100) {
            return "Invalid Marks";
        } else if (marks >= 91) {
            return "A";
        } else if (marks >= 81) {
            return "B";
        } else if (marks >= 71) { 
            return "C";
        } else if (marks >= 61) {
            return "D";
        } else if (marks >= 51) {
            return "E";
        } else if (marks >= 41) {
            return "F";
        } else {
            return "Fail";
        }
    }
}