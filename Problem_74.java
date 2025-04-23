/*

Problem: 74
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

Example 1:
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

 */

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Problem_74 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            boolean isDuplicate = false;
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Create input list: [1, 2, 3, 3, 4, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        Problem_74 solution = new Problem_74();
        ListNode result = solution.deleteDuplicates(head);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
