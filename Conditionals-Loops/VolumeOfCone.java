import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double volume = (Math.PI * r * r * h) / 3;
        System.out.printf("Volume: %.2f", volume);
        sc.close();
    }
}
