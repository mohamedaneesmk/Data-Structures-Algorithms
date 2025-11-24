package Functions;

import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        checkEligibility(age);
        sc.close();
    }
    
    // O(1) time complexity
    public static void checkEligibility(int age) {
        if (isEligibleToVote(age)) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
            System.out.println("You can vote after " + (18 - age) + " years");
        }
    }
    
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}