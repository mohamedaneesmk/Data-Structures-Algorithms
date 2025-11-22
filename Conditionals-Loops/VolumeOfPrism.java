import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseArea = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = baseArea * height;
        System.out.println("Volume: " + volume);
        sc.close();
    }
}
