public class SmallestLetterGreaterThanTarget { 
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';

        char result = nextGreatestLetter(letters, target);
        System.out.println(result);
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = end + (start - end) / 2;

            if (letters[mid] <= target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return letters[start % letters.length];
    }
}