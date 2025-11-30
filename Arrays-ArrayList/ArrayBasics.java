public class ArrayBasics {
    public static void main(String[] args) {
        System.out.println("=== JAVA ARRAY BASICS ===\n");
        
        // 1. ARRAY DECLARATION AND INITIALIZATION
        System.out.println("1. Declaration and Initialization:");
        
        // Method 1: Declare then initialize
        int[] numbers;
        numbers = new int[5]; // Creates array of size 5 with default values (0)
        System.out.println("Empty array length: " + numbers.length);
        
        // Method 2: Declare and initialize in one line
        int[] scores = new int[3];
        
        // Method 3: Declare and initialize with values
        int[] ages = {18, 25, 30, 42, 55};
        System.out.println("Array with values length: " + ages.length);
        
        // Method 4: Using new keyword with values
        String[] names = new String[]{"Alice", "Bob", "Charlie"};
        System.out.println();
        
        
        // 2. ACCESSING ARRAY ELEMENTS
        System.out.println("2. Accessing Elements:");
        System.out.println("First age: " + ages[0]); // Index starts at 0
        System.out.println("Last age: " + ages[ages.length - 1]);
        System.out.println("Second name: " + names[1]);
        System.out.println();
        
        
        // 3. MODIFYING ARRAY ELEMENTS
        System.out.println("3. Modifying Elements:");
        scores[0] = 85;
        scores[1] = 92;
        scores[2] = 78;
        System.out.println("Score at index 1: " + scores[1]);
        
        // Modify existing value
        scores[1] = 95;
        System.out.println("Updated score at index 1: " + scores[1]);
        System.out.println();
        
        
        // 4. ITERATING THROUGH ARRAYS
        System.out.println("4. Iterating Through Arrays:");
        
        // Using traditional for loop
        System.out.print("Scores (for loop): ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        
        // Using enhanced for loop (for-each)
        System.out.print("Names (for-each): ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("\n");
        
        
        // 5. MULTIDIMENSIONAL ARRAYS
        System.out.println("5. Multidimensional Arrays (2D):");
        
        // 2D array - like a table/matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        // 6. COMMON ARRAY OPERATIONS
        System.out.println("6. Common Array Operations:");
        
        int[] data = {10, 25, 5, 30, 15};
        
        // Finding sum
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        
        // Finding average
        double average = (double) sum / data.length;
        System.out.println("Average: " + average);
        
        // Finding maximum
        int max = data[0];
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value: " + max);
        
        // Finding minimum
        int min = data[0];
        for (int num : data) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println();
        
        
        // 7. ARRAY OF OBJECTS
        System.out.println("7. Array of Objects:");
        
        String[] cities = {"Mumbai", "Delhi", "Bangalore", "Chennai"};
        System.out.print("Cities: ");
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println("\n");
        
        
        // 8. COMMON PITFALLS AND IMPORTANT NOTES
        System.out.println("8. Important Notes:");
        System.out.println("- Array size is FIXED once created");
        System.out.println("- Index starts from 0");
        System.out.println("- Last index is (length - 1)");
        System.out.println("- ArrayIndexOutOfBoundsException if accessing invalid index");
        
        // Example of bounds
        int[] small = {1, 2, 3};
        System.out.println("Array length: " + small.length);
        System.out.println("Valid indices: 0 to " + (small.length - 1));
        
        // Uncomment to see ArrayIndexOutOfBoundsException:
        // System.out.println(small[3]); // ERROR!
        System.out.println();
        
        
        // 9. COPYING ARRAYS
        System.out.println("9. Copying Arrays:");
        
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];
        
        // Manual copy
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        
        System.out.print("Original: ");
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Copy: ");
        for (int num : copy) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        
        // 10. SEARCHING IN ARRAY
        System.out.println("10. Searching in Array:");
        
        int[] searchArray = {45, 23, 67, 12, 89, 34};
        int target = 67;
        int foundIndex = -1;
        
        for (int i = 0; i < searchArray.length; i++) {
            if (searchArray[i] == target) {
                foundIndex = i;
                break;
            }
        }
        
        if (foundIndex != -1) {
            System.out.println("Found " + target + " at index " + foundIndex);
        } else {
            System.out.println(target + " not found");
        }
        
        System.out.println("\n=== END OF ARRAY BASICS ===");
    }
}