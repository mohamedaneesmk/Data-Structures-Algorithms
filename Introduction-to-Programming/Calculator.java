// Take in two numbers and an operator (+, -, *, /) and calculate the value.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number1 = scanner.nextInt(); 
        float number2 = scanner.nextInt();
        char operation = scanner.next().charAt(0);

        float result = findResult(number1, number2, operation);
        System.out.println(result);
        scanner.close();
    }

    private static float findResult(float number1, float number2, char operation) {
        switch (operation) {
            case '+':
                return number1 + number2;

            case '-':
                return number1 - number2;

            case '*':
                return number1 * number2;

            case '/':
                if (number2 == 0) {
                    System.out.println("Cannot divide by Zero");
                    return 0;
                }
                else
                    return (number1 / number2);
            default:
                System.out.println("Enter a valid expression (+,-,*,/)");
                return 0;
        }
    }
}
