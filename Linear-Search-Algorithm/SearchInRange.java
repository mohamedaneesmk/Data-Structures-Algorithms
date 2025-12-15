public class SearchInRange {
    public static void main(String[] args) {
        int[] array = { 18, 12, -7, 3, 14, 28 };
        int start = 1;
        int end = 4;
        int target = 3;
        System.out.println(linearSearch(array, start, end, target));
    }

    private static int linearSearch(int[] array, int start, int end, int target) {
        for (int index = start; index < end; index++) {
            if (array[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
