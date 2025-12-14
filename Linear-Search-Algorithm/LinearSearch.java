public class LinearSearch {
    
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        // Traverse through all array elements
        for (int i = 0; i < arr.length; i++) {
            // If element is found, return its index
            if (arr[i] == target) {
                return i;
            }
        }
        // Element not found, return -1
        return -1;
    }
    
    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] numbers = {10, 23, 45, 70, 11, 15, 89, 34};
        int target = 70;
        
        int result = linearSearch(numbers, target);
        
        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
        
        // Test with element not in array
        int notFound = 100;
        result = linearSearch(numbers, notFound);
        
        if (result != -1) {
            System.out.println("Element " + notFound + " found at index: " + result);
        } else {
            System.out.println("Element " + notFound + " not found in the array");
        }
    }
}