public class SwitchBasics {

    public static void main(String[] args) {

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Invalid day");
        }

        // Switch with char
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Average");
                break;

            default:
                System.out.println("Fail");
        }
    }
}
