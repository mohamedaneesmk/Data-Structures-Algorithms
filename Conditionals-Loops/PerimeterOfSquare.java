import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        System.out.println("Perimeter: " + (4 * side));
        sc.close();
    }
}
