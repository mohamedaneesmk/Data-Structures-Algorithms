public class LinearSearchInStrings {
    public static void main(String[] args) { 
        String name = "Anees";
        char target = 'y'; 
        System.out.println(isCharacterFound(name, target));
    }

    private static boolean isCharacterFound(String name, char target) {
        if(name.length() == 0) return false;

        for (char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
