public class BinarySearch2D {
    
    // 1. Fully Sorted 2D Array (row-wise and column-wise)
    // Time: O(m + n), Space: O(1)
    public static boolean searchSortedMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        // Start from top-right corner
        int row = 0;
        int col = matrix[0].length - 1;
        
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        
        return false;
    }
    
    // 2. Row-wise Sorted (treat as flattened 1D array)
    // Time: O(log(m*n)), Space: O(1)
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Convert 1D index to 2D coordinates
            int midVal = matrix[mid / n][mid % n];
            
            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
    
    // 3. Each Row Sorted Independently
    // Time: O(m * log n), Space: O(1)
    public static boolean searchEachRow(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        
        for (int[] row : matrix) {
            if (binarySearch(row, target)) {
                return true;
            }
        }
        
        return false;
    }
    
    // Helper: Standard binary search on 1D array
    private static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }
    
    // Test cases
    public static void main(String[] args) {
        // Test Case 1: Fully sorted matrix
        int[][] matrix1 = {
            {1,  4,  7,  11},
            {2,  5,  8,  12},
            {3,  6,  9,  16},
            {10, 13, 14, 17}
        };
        
        System.out.println("Fully Sorted Matrix:");
        System.out.println("Search 5: " + searchSortedMatrix(matrix1, 5));  // true
        System.out.println("Search 20: " + searchSortedMatrix(matrix1, 20)); // false
        
        // Test Case 2: Row-wise sorted (flattened)
        int[][] matrix2 = {
            {1,  3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        
        System.out.println("\nRow-wise Sorted Matrix (Flattened):");
        System.out.println("Search 3: " + searchMatrix(matrix2, 3));   // true
        System.out.println("Search 13: " + searchMatrix(matrix2, 13)); // false
        
        // Test Case 3: Each row sorted independently
        int[][] matrix3 = {
            {1,  4,  7,  9},
            {2,  5,  8,  12},
            {3,  6,  10, 15}
        };
        
        System.out.println("\nEach Row Sorted Independently:");
        System.out.println("Search 8: " + searchEachRow(matrix3, 8));  // true
        System.out.println("Search 11: " + searchEachRow(matrix3, 11)); // false
    }
}