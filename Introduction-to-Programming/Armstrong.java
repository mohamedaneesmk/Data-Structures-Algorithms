import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong Numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        } 

        scanner.close();
    }

    private static boolean isArmstrong(int number) {
        int original = number;
        
        // Count digits (optimized)
        int digits = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        int sum = 0;
        temp = number;

        // Sum of digits raised to 'digits' power
        while (temp != 0) {
            int digit = temp % 10;

            // Fast exponentiation (instead of Math.pow)
            int poweredValue = 1;
            for (int i = 0; i < digits; i++) {
                poweredValue *= digit;
            }

            sum += poweredValue;
            temp /= 10;
        }

        return sum == original;
    }
}
