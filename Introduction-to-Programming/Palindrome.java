// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next().toLowerCase();

        if (findPalindrom(input))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

        scanner.close();
    }

    private static boolean findPalindrom(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true; 
    }
}
