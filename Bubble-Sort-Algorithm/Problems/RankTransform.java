import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransform {
    public static void main(String[] args) {
        int[] arr = { 40, 10, 20, 30 };
        int[] result = arrayRankTransform(arr);
        for (int rank : result) {
            System.out.print(rank + " ");
        }
    }

    private static int[] arrayRankTransform(int[] arr) {
        // Step 1: Create a sorted copy of the array
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // Step 2: Create a mapping from number to its rank
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Step 3: Transform the original array to its ranks
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}
