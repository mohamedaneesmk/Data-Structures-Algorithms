class InsertionSortList {

    // Node definition
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to perform insertion sort
    public static ListNode insertionSortList(ListNode head) {

        // Dummy node (sorted list head helper)
        ListNode dummy = new ListNode(0);

        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;   // save next node

            // Find correct position
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // Insert current node
            curr.next = prev.next;
            prev.next = curr;

            curr = next;   // move forward
        }

        return dummy.next;
    }

    // Function to print linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        // Create linked list: 4 -> 2 -> 1 -> 3
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        System.out.println("Before Sorting:");
        printList(head);

        head = insertionSortList(head);

        System.out.println("After Sorting:");
        printList(head);
    }
}
