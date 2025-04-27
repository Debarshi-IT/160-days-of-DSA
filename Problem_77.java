/*

Problem: 77
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.

Example 1:
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]

Example 2:
Input: head = [2,1], x = 2
Output: [1,2]

 */

import java.util.Scanner;

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Problem_77 {

    public static ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode(0);
        ListNode afterHead = new ListNode(0);

        ListNode before = beforeHead;
        ListNode after = afterHead;

        while (head != null) {
            if (head.val < x) {
                before.next = head;
                before = before.next;
            } else {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        after.next = null;
        before.next = afterHead.next;

        return beforeHead.next;
    }

    public static ListNode buildList(Scanner sc) {
        System.out.println("Enter elements of the linked list (enter -1 to end):");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (true) {
            int val = sc.nextInt();
            if (val == -1) {
                break;
            }
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListNode head = buildList(sc);

        System.out.print("Enter the partition value x: ");
        int x = sc.nextInt();

        ListNode result = partition(head, x);

        System.out.println("Partitioned Linked List:");
        printList(result);

        sc.close();
    }
}
