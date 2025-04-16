/*

Problem: 68
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1] solve in java
 */

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Problem_68 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Dummy node handles edge cases like removing the head
        ListNode dummy = new ListNode(0, head);
        ListNode first = dummy;
        ListNode second = dummy;

        // Move first n+1 steps ahead to maintain a gap of n between first and second
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Skip the desired node
        second.next = second.next.next;

        return dummy.next;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Example test cases
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        head1 = removeNthFromEnd(head1, 2);
        printList(head1); // Output: 1 -> 2 -> 3 -> 5 -> null

        ListNode head2 = new ListNode(1);
        head2 = removeNthFromEnd(head2, 1);
        printList(head2); // Output: null

        ListNode head3 = new ListNode(1, new ListNode(2));
        head3 = removeNthFromEnd(head3, 1);
        printList(head3); // Output: 1 -> null
    }
}
