import java.util.*;

public class ArrayListCompleteGuide {
    public static void main(String[] args) {
        System.out.println("=== COMPLETE ARRAYLIST GUIDE ===\n");
        
        // ===== 1. CREATION & INITIALIZATION =====
        System.out.println("1. CREATION & INITIALIZATION");
        System.out.println("-".repeat(50));
        
        // Empty ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Empty list: " + list1);
        
        // With initial capacity (optimization)
        ArrayList<String> list2 = new ArrayList<>(20);
        System.out.println("List with capacity 20: " + list2);
        
        // From another collection
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("From Arrays.asList: " + list3);
        
        // Using List.of() (Java 9+) - creates immutable, then copy to ArrayList
        ArrayList<String> list4 = new ArrayList<>(List.of("A", "B", "C"));
        System.out.println("From List.of: " + list4);
        
        // Anonymous initialization (inline)
        ArrayList<Double> list5 = new ArrayList<>() {{
            add(1.5);
            add(2.5);
            add(3.5);
        }};
        System.out.println("Anonymous init: " + list5 + "\n");
        
        
        // ===== 2. ADDING ELEMENTS =====
        System.out.println("2. ADDING ELEMENTS");
        System.out.println("-".repeat(50));
        
        ArrayList<String> fruits = new ArrayList<>();
        
        // add(element) - adds at the end
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("After add(): " + fruits);
        
        // add(index, element) - inserts at specific position
        fruits.add(1, "Mango");  // Inserts at index 1
        System.out.println("After add(1, 'Mango'): " + fruits);
        
        // addAll(collection) - adds all elements from another collection
        fruits.addAll(Arrays.asList("Orange", "Grape"));
        System.out.println("After addAll(): " + fruits);
        
        // addAll(index, collection) - inserts collection at specific position
        fruits.addAll(2, Arrays.asList("Kiwi", "Peach"));
        System.out.println("After addAll(2, ...): " + fruits + "\n");
        
        
        // ===== 3. ACCESSING ELEMENTS =====
        System.out.println("3. ACCESSING ELEMENTS");
        System.out.println("-".repeat(50));
        
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        
        // get(index) - retrieve element at index
        System.out.println("get(0): " + nums.get(0));
        System.out.println("get(2): " + nums.get(2));
        
        // First and last elements
        System.out.println("First element: " + nums.get(0));
        System.out.println("Last element: " + nums.get(nums.size() - 1));
        
        // size() - number of elements
        System.out.println("Size: " + nums.size());
        
        // isEmpty() - check if empty
        System.out.println("Is empty? " + nums.isEmpty() + "\n");
        
        
        // ===== 4. MODIFYING ELEMENTS =====
        System.out.println("4. MODIFYING ELEMENTS");
        System.out.println("-".repeat(50));
        
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));
        System.out.println("Original: " + colors);
        
        // set(index, element) - replace element at index
        colors.set(1, "Yellow");
        System.out.println("After set(1, 'Yellow'): " + colors + "\n");
        
        
        // ===== 5. REMOVING ELEMENTS =====
        System.out.println("5. REMOVING ELEMENTS");
        System.out.println("-".repeat(50));
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 20));
        System.out.println("Original: " + numbers);
        
        // remove(index) - removes by index, returns removed element
        int removed = numbers.remove(2);
        System.out.println("After remove(2): " + numbers + " (removed: " + removed + ")");
        
        // remove(Object) - removes first occurrence, returns boolean
        boolean success = numbers.remove(Integer.valueOf(20));
        System.out.println("After remove(20): " + numbers + " (success: " + success + ")");
        
        // clear() - removes all elements
        ArrayList<String> temp = new ArrayList<>(Arrays.asList("A", "B", "C"));
        temp.clear();
        System.out.println("After clear(): " + temp + "\n");
        
        
        // ===== 6. SEARCHING =====
        System.out.println("6. SEARCHING");
        System.out.println("-".repeat(50));
        
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog", "Bird", "Dog"));
        
        // contains(element) - check if element exists
        System.out.println("Contains 'Dog'? " + animals.contains("Dog"));
        System.out.println("Contains 'Lion'? " + animals.contains("Lion"));
        
        // indexOf(element) - first occurrence index (-1 if not found)
        System.out.println("indexOf('Dog'): " + animals.indexOf("Dog"));
        System.out.println("indexOf('Lion'): " + animals.indexOf("Lion"));
        
        // lastIndexOf(element) - last occurrence index
        System.out.println("lastIndexOf('Dog'): " + animals.lastIndexOf("Dog") + "\n");
        
        
        // ===== 7. ITERATION =====
        System.out.println("7. ITERATION");
        System.out.println("-".repeat(50));
        
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        
        // Traditional for loop
        System.out.print("Traditional for: ");
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i) + " ");
        }
        System.out.println();
        
        // Enhanced for loop (for-each)
        System.out.print("Enhanced for: ");
        for (int val : values) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        // forEach with lambda (Java 8+)
        System.out.print("forEach lambda: ");
        values.forEach(val -> System.out.print(val + " "));
        System.out.println();
        
        // Iterator
        System.out.print("Iterator: ");
        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        // ListIterator (bidirectional)
        System.out.print("ListIterator (backward): ");
        ListIterator<Integer> listIterator = values.listIterator(values.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println("\n");
        
        
        // ===== 8. SORTING =====
        System.out.println("8. SORTING");
        System.out.println("-".repeat(50));
        
        ArrayList<Integer> unsorted = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        System.out.println("Original: " + unsorted);
        
        // Collections.sort() - ascending order
        Collections.sort(unsorted);
        System.out.println("Ascending: " + unsorted);
        
        // Collections.sort() with Comparator - descending
        Collections.sort(unsorted, Collections.reverseOrder());
        System.out.println("Descending: " + unsorted);
        
        // sort() method (Java 8+)
        unsorted.sort(Comparator.naturalOrder());
        System.out.println("Using sort(): " + unsorted);
        
        // Custom comparator
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "pie", "banana", "cat"));
        words.sort(Comparator.comparingInt(String::length));
        System.out.println("Sort by length: " + words + "\n");
        
        
        // ===== 9. SUBLIST & CONVERSION =====
        System.out.println("9. SUBLIST & CONVERSION");
        System.out.println("-".repeat(50));
        
        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
        
        // subList(from, to) - returns view (to is exclusive)
        List<Integer> sub = original.subList(2, 5);
        System.out.println("subList(2, 5): " + sub);
        
        // toArray() - convert to Object array
        Object[] arr1 = original.toArray();
        System.out.println("toArray(): " + Arrays.toString(arr1));
        
        // toArray(T[] a) - convert to typed array
        Integer[] arr2 = original.toArray(new Integer[0]);
        System.out.println("toArray(Integer[]): " + Arrays.toString(arr2) + "\n");
        
        
        // ===== 10. BULK OPERATIONS =====
        System.out.println("10. BULK OPERATIONS");
        System.out.println("-".repeat(50));
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> toRemove = new ArrayList<>(Arrays.asList(2, 4, 6));
        ArrayList<Integer> toRetain = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        
        // removeAll(collection) - removes all elements in collection
        ArrayList<Integer> copy1 = new ArrayList<>(list);
        copy1.removeAll(toRemove);
        System.out.println("After removeAll([2,4,6]): " + copy1);
        
        // retainAll(collection) - keeps only elements in collection
        ArrayList<Integer> copy2 = new ArrayList<>(list);
        copy2.retainAll(toRetain);
        System.out.println("After retainAll([1,3,5,7]): " + copy2);
        
        // containsAll(collection) - checks if all elements exist
        System.out.println("containsAll([1,2,3])? " + list.containsAll(Arrays.asList(1, 2, 3)) + "\n");
        
        
        // ===== 11. JAVA 8+ STREAM OPERATIONS =====
        System.out.println("11. JAVA 8+ STREAM OPERATIONS");
        System.out.println("-".repeat(50));
        
        ArrayList<Integer> streamList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        
        // Filter
        List<Integer> evens = streamList.stream()
            .filter(n -> n % 2 == 0)
            .toList();
        System.out.println("Filter (evens): " + evens);
        
        // Map
        List<Integer> squared = streamList.stream()
            .map(n -> n * n)
            .toList();
        System.out.println("Map (squared): " + squared);
        
        // Reduce
        int sum = streamList.stream()
            .reduce(0, Integer::sum);
        System.out.println("Reduce (sum): " + sum);
        
        // anyMatch, allMatch, noneMatch
        System.out.println("Any > 5? " + streamList.stream().anyMatch(n -> n > 5));
        System.out.println("All > 0? " + streamList.stream().allMatch(n -> n > 0));
        System.out.println("None < 0? " + streamList.stream().noneMatch(n -> n < 0) + "\n");
        
        
        // ===== 12. CAPACITY MANAGEMENT =====
        System.out.println("12. CAPACITY MANAGEMENT");
        System.out.println("-".repeat(50));
        
        ArrayList<String> capacityList = new ArrayList<>();
        System.out.println("Initial size: " + capacityList.size());
        
        // ensureCapacity(minCapacity) - pre-allocate space (optimization)
        capacityList.ensureCapacity(100);
        System.out.println("After ensureCapacity(100), size: " + capacityList.size());
        
        // trimToSize() - reduce capacity to current size
        capacityList.add("A");
        capacityList.add("B");
        capacityList.trimToSize();
        System.out.println("After trimToSize(), size: " + capacityList.size() + "\n");
        
        
        // ===== 13. CLONING & EQUALITY =====
        System.out.println("13. CLONING & EQUALITY");
        System.out.println("-".repeat(50));
        
        ArrayList<String> original2 = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        
        // clone() - shallow copy
        @SuppressWarnings("unchecked")
        ArrayList<String> cloned = (ArrayList<String>) original2.clone();
        System.out.println("Original: " + original2);
        System.out.println("Cloned: " + cloned);
        
        // equals() - checks content equality
        ArrayList<String> equal = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        System.out.println("original.equals(equal)? " + original2.equals(equal));
        
        // Copy constructor (deep copy for immutable elements)
        ArrayList<String> copied = new ArrayList<>(original2);
        System.out.println("Copied: " + copied + "\n");
        
        
        // ===== 14. COMMON PITFALLS =====
        System.out.println("14. COMMON PITFALLS");
        System.out.println("-".repeat(50));
        
        // Pitfall 1: Removing during iteration
        ArrayList<Integer> pitfall1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.print("Safe removal with Iterator: ");
        Iterator<Integer> it = pitfall1.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) {
                it.remove();  // Safe way
            }
        }
        System.out.println(pitfall1);
        
        // Pitfall 2: remove(int) vs remove(Object) with Integer
        ArrayList<Integer> pitfall2 = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
        pitfall2.remove(1);  // Removes element at index 1, NOT value 1
        System.out.println("After remove(1): " + pitfall2);
        pitfall2.remove(Integer.valueOf(2));  // Removes value 2
        System.out.println("After remove(Integer.valueOf(2)): " + pitfall2);
        
        // Pitfall 3: Modifying during enhanced for-loop (ConcurrentModificationException)
        System.out.println("⚠️ Don't modify ArrayList during enhanced for-loop!");
        
        System.out.println("\n=== END OF GUIDE ===");
    }
}