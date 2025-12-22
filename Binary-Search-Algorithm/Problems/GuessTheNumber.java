public class GuessTheNumber {

    // Picked number (this simulates the hidden number)
    private static int pickedNumber = 6;
 
    public static void main(String[] args) {
        int num = 10;
        int result = findTheNumber(num);
        System.out.println("Guessed Number: " + result);
    }

    private static int findTheNumber(int num) {
        int low = 1;
        int high = num; 

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);

            if (result == 0)
                return mid;
            else if (result == 1)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    /**
     * Mock implementation of guess API
     * @param num guessed number
     * @return -1 if num is higher than pickedNumber
     *          1 if num is lower than pickedNumber
     *          0 if correct
     */
    private static int guess(int num) {
        if (num > pickedNumber)
            return -1;
        else if (num < pickedNumber)
            return 1;
        else
            return 0;
    }
}
