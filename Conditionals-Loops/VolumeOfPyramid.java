import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseArea = sc.nextDouble();
        double h = sc.nextDouble();
        double volume = (baseArea * h) / 3;
        System.out.println("Volume: " + volume);
        sc.close();
    }
}

