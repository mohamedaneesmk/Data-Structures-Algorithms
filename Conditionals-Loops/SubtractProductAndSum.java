import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1, sum = 0;

        while(num > 0){
            int digit = num % 10;
            product *= digit;
            sum += digit;
            num /= 10;
        }
        System.out.println(product - sum);
        sc.close();
    }
}
