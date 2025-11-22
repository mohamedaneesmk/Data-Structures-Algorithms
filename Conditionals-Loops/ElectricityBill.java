import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();
        double bill = calculateBill(units);

        System.out.println("Total Bill Amount: " + bill);

        scanner.close();
    }

    // Method to calculate bill based on unit slabs
    private static double calculateBill(int units) {
        double price = 0;

        if (units <= 100) {
            price = units * 5;        // ₹5 per unit for first 100
        } else if (units <= 200) {
            price = (100 * 5) + (units - 100) * 7;  // Next 100 units → ₹7
        } else {
            price = (100 * 5) + (100 * 7) + (units - 200) * 10; // Above 200 → ₹10
        }

        return price;
    }
}
