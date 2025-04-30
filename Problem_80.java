/*

Problem: 80
Given the root of a binary tree, flatten the tree into a "linked list":
The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.

Example 1:
Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]

Example 2:
Input: root = []
Output: []

Example 3:
Input: root = [0]
Output: [0]

 */

import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Problem_80 {

    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode leftSubtree = root.left;
        TreeNode rightSubtree = root.right;

        root.left = null;
        root.right = leftSubtree;

        TreeNode curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        curr.right = rightSubtree;
    }

    public static TreeNode buildTree(Scanner sc) {
        System.out.println("Enter the values of the tree in level order (use 'null' for empty nodes):");
        String[] values = sc.nextLine().split("\\s+");

        if (values.length == 0 || values[0].equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();

            // Left child
            if (i < values.length && !values[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(current.left);
            }
            i++;

            // Right child
            if (i < values.length && !values[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    public static void printFlattenedTree(TreeNode root) {
        System.out.println("Flattened linked list:");
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeNode root = buildTree(sc);
        flatten(root);
        printFlattenedTree(root);

        sc.close();
    }
}
