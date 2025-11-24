package Functions;

import java.util.Scanner;

public class PalindromeFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
        sc.close();
    }
    
    // O(log n) time - number of digits
    public static boolean isPalindrome(int num) {
        if (num < 0) return false; // Negative numbers are not palindromes
        
        int original = num;
        int reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return original == reversed;
    }
    
    // Alternative: String-based approach
    public static boolean isPalindromeString(int num) {
        String str = String.valueOf(Math.abs(num));
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}