import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("TSA: " + (6 * a * a));
        sc.close();
    }
}
