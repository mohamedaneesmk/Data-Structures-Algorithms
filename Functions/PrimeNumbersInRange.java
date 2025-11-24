package Functions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        
        List<Integer> primes = getPrimesInRange(start, end);
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        System.out.println(primes);
        sc.close();
    }
    
    // Returns all primes in range - O(n√n) time
    public static List<Integer> getPrimesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
    
    // Optimized O(√n) prime check
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Alternative: Sieve of Eratosthenes for large ranges - O(n log log n)
    public static List<Integer> getPrimesUsingSieve(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        if (end < 2) return primes;
        
        boolean[] isPrime = new boolean[end + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        
        for (int i = 2; i * i <= end; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        for (int i = Math.max(2, start); i <= end; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}