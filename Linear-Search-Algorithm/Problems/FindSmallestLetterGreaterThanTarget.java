public class FindSmallestLetterGreaterThanTarget {

    // LeetCode Solution Method
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // Binary Search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Wrap-around using modulo
        return letters[start % letters.length];
    }

    // Main method for local testing
    public static void main(String[] args) {
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        System.out.println(nextGreatestLetter(letters1, target1)); // c

        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        System.out.println(nextGreatestLetter(letters2, target2)); // f

        char[] letters3 = {'x', 'x', 'y', 'y'};
        char target3 = 'z';
        System.out.println(nextGreatestLetter(letters3, target3)); // x
    }
}
