import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            // Count character frequencies
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            // Convert count array to string key
            StringBuilder key = new StringBuilder();
            for (int num : count) {
                key.append('#');
                key.append(num);
            }

            String keyStr = key.toString();
            map.putIfAbsent(keyStr, new ArrayList<>());
            map.get(keyStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}