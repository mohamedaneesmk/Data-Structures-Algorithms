public class EvenDaysInAugust {
    public static void main(String[] args) {
        // August has 31 days
        int totalDays = 31;
        int evenDays = totalDays / 2;
        
        System.out.println("Anees can go out on " + evenDays + " days in August");
        System.out.println("\nEven days in August:");
        
        for (int day = 2; day <= totalDays; day += 2) {
            System.out.print(day + " ");
        }
        System.out.println();
    }
    
    // Generalized method for any month 
    public static int countEvenDays(int daysInMonth) {
        return daysInMonth / 2;
    }
}