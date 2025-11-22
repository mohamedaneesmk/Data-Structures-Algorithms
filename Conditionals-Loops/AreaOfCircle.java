// Area Of Circle Java Program

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextFloat();
        double area = Math.PI * radius * radius;
        area = Math.round(area * 100.0) / 100.0;
        System.out.println(area);
        scanner.close();
    }
}
