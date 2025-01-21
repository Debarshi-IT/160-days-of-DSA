/*

Problem 5:
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers
into the lexicographically next greater permutation.
If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.

Input: arr = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.

Input: arr = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
Explanation: The next permutation of the given array is {3, 4, 5, 1, 2}.

*/

import java.util.*;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("The original array is: " + Arrays.toString(a));
        nextPermutation(a);
        System.out.println("The next permutation is: " + Arrays.toString(a));
    }
    private static void nextPermutation(int[] a) {
        int n = a.length;
        int id1 = -1,id2 = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                id1 = i;
                break;
            }
        }
        if (id1 == -1) {
            reverse(a, 0, n - 1);
            return;
        }
        for (int i = n - 1; i > id1; i--) {
            if (a[i] > a[id1]) {
                id2 = i;
                break;
            }
        }
        swap(a, id1, id2);
        reverse(a, id1 + 1, n - 1);
    }
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    private static void reverse(int[] a, int s, int e) {
        while (s < e) {
            swap(a, s, e);
            s++;
            e--;
        }
    }
}
