/*

Problem: 57
There is an integer array a sorted in non-decreasing order (not necessarily with distinct values).
Before being passed to your function, a is rotated at an unknown pivot index k (0 <= k < a.length) such that the resulting array is [a[k], a[k+1], ..., a[n-1], a[0], a[1], ..., a[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
Given the array a after the rotation and an integer target, return true if target is in a, or false if it is not in a.
You must decrease the overall operation steps as much as possible.

Example 1:
Input: a = [2,5,6,0,0,1,2], target = 0
Output: true

Example 2:
Input: a = [2,5,6,0,0,1,2], target = 3
Output: false

*/

import java.util.Scanner;

public class Problem_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Seats array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int t = sc.nextInt();
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == t) {
                System.out.println("True");
            }
            //fasne vala code
            if (a[mid] == a[left] && a[mid] == a[right]) {
                left++;
                right--;
                continue;
            }
            //binary search
            if (a[left] <= a[mid]) {
                if (a[left] <= t && t <= a[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (a[mid] <= t && t <= a[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        System.out.println("False");
    }
}