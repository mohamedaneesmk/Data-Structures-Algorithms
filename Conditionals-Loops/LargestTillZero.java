import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE, n;

        while((n = sc.nextInt()) != 0){
            if(n > max) max = n;
        }
        System.out.println("Largest: " + max);
        sc.close();
    }
}
