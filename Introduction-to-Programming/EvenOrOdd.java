// Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); 
        System.out.println(number % 2 == 0 ? "Even" : "Odd");
        scanner.close();
    }
}
