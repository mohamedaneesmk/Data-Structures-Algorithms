public class SwitchWithString {

    public static void main(String[] args) {

        String operation = "add";
        int a = 10, b = 5;

        switch (operation) {
            case "add":
                System.out.println("Sum = " + (a + b));
                break;

            case "subtract":
                System.out.println("Difference = " + (a - b));
                break;

            case "multiply":
                System.out.println("Product = " + (a * b));
                break;

            case "divide":
                System.out.println("Quotient = " + (a / b));
                break;

            default:
                System.out.println("Invalid operation");
        }
    }
}
