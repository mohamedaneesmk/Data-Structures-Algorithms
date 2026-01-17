public class InsertionSortList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        // Creating Linked List: 4 -> 3 -> 1 -> 2
        ListNode head = new ListNode(4,
                new ListNode(3,
                        new ListNode(1,
                                new ListNode(2))));

        ListNode sortedHead = insertionSortList(head);

        // Print sorted list
        printList(sortedHead);
    }

    public static ListNode insertionSortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;

            // Find correct position
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            // Insert node
            curr.next = prev.next;
            prev.next = curr;

            curr = next;
        }

        return dummy.next;
    }

    // Helper function to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
