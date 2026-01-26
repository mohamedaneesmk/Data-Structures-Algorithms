public class SortList {

    // Node Definition
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Convert Array to Linked List
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    // Insertion Sort Logic
    public static ListNode insertionSortList(ListNode head) {

        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }

        return dummy.next;
    }

    // Print Linked List in Array format
    public static void printList(ListNode head) {
        System.out.print("[");

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(",");
            temp = temp.next;
        }

        System.out.println("]");
    }

    // Main Method
    public static void main(String[] args) {

        int[][] testCases = {
            {4, 2, 1, 3},
            {-1, 5, 3, 4, 0},
            {}
        };

        for (int i = 0; i < testCases.length; i++) {

            System.out.print("\nInput : ");
            printList(createList(testCases[i]));

            ListNode sorted = insertionSortList(createList(testCases[i]));

            System.out.print("Output: ");
            printList(sorted);
        }
    }
}
