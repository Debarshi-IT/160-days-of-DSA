/*

Problem: 78
Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]

Example 2:
Input: head = [5], left = 1, right = 1
Output: [5]

 */

import java.util.Scanner;

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Problem_78 {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode next = null;
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
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

        System.out.print("Enter left position: ");
        int left = sc.nextInt();

        System.out.print("Enter right position: ");
        int right = sc.nextInt();

        ListNode result = reverseBetween(head, left, right);

        System.out.println("Linked List after reversal:");
        printList(result);

        sc.close();
    }
}
