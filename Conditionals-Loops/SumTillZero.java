import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;

        while((n = sc.nextInt()) != 0){
            sum += n;
        }
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
