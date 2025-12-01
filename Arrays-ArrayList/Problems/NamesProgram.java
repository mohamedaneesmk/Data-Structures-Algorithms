package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class NamesProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("-".repeat(10));
            System.out.println("SELECT YOUR CHOICE : ");
            System.out.println("1. ADD NAME");
            System.out.println("2. REMOVE NAME");
            System.out.println("3. CHECK IF NAME EXISTS");
            System.out.println("4. PRINT THE NAMES");
            System.out.println("5. EXIT");
            System.out.println("-".repeat(10));

            int userChoice = scanner.nextInt();
            scanner.nextLine(); // Fix input issue

            switch (userChoice) {
                case 1:
                    System.out.print("ENTER THE NAME = ");
                    String inputName = scanner.nextLine();
                    names.add(inputName);
                    break;

                case 2:
                    System.out.print("ENTER THE NAME YOU WANT TO REMOVE = ");
                    String removeName = scanner.nextLine();
                    if (names.remove(removeName)) {
                        System.out.println(removeName + " removed");
                    } else {
                        System.out.println(removeName + " not found");
                    }
                    break;

                case 3:
                    System.out.print("ENTER THE NAME YOU WANT TO CHECK = ");
                    String checkName = scanner.nextLine();
                    System.out.println(
                            names.contains(checkName)
                                    ? "Yes, name exists"
                                    : "No, name does not exist"
                    );
                    break;

                case 4:
                    System.out.println("Names in List: ");
                    for (String name : names) {
                        System.out.println(name);
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Enter a valid choice (1-5)");
            }
        }
        scanner.close();
    }
}
