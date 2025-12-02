package Problems;

import java.util.*;

class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // Map ruleKey to corresponding index
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2; // name
        }

        // Count items that match the rule
        int count = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }

    // Test method
    public static void main(String[] args) {
        CountItemsMatchingRule solution = new CountItemsMatchingRule();

        List<List<String>> items1 = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone"));
        System.out.println(solution.countMatches(items1, "color", "silver"));

    }

    // Alternative cleaner solution using HashMap
    class SolutionOptimized {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            // Create a mapping from ruleKey to index
            Map<String, Integer> keyToIndex = new HashMap<>();
            keyToIndex.put("type", 0);
            keyToIndex.put("color", 1);
            keyToIndex.put("name", 2);

            int index = keyToIndex.get(ruleKey);

            // Count matches using stream (Java 8+)
            return (int) items.stream()
                    .filter(item -> item.get(index).equals(ruleValue))
                    .count();
        }
    }
}