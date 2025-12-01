package Problems;

import java.util.HashSet;
import java.util.Set;

public class CheckPanagram {
    public static void main(String[] args) {
        String input = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPanagram(input));
    }

    private static boolean isPanagram(String input) {
        if (input.length() < 26)
            return false;

        Set<Character> charSet = new HashSet<>();
        for (char ch : input.toCharArray()) {
            charSet.add(ch);
        }

        return charSet.size() == 26;
    }
}
