/*

Problem: 79
Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.

Example 1:
Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.

Example 2:
Input: head = []
Output: []

 */

import java.util.Scanner;

class ListNode {

    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Problem_79 {

    private static ListNode head;

    public static TreeNode sortedListToBST(int size) {
        if (size <= 0) {
            return null;
        }
        TreeNode left = sortedListToBST(size / 2);
        TreeNode root = new TreeNode(head.val);
        root.left = left;

        head = head.next;
        root.right = sortedListToBST(size - size / 2 - 1);

        return root;
    }

    public static ListNode buildList(Scanner sc) {
        System.out.println("Enter elements of the sorted linked list (enter -1 to end):");
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

    public static int getSize(ListNode node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public static void printPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        head = buildList(sc);

        int size = getSize(head);
        TreeNode root = sortedListToBST(size);

        System.out.println("Preorder Traversal of the BST:");
        printPreOrder(root);

        sc.close();
    }
}
