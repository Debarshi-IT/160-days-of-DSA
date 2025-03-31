/*

Problem: 54
Given an array of integers nums which is sorted in ascending order, and an integer t, write a function to search t in nums. If t exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [-1,0,3,5,9,12], t = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], t = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

 */

import java.util.Scanner;

public class Problem_54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t;
        System.out.println("Enter the Seats array size: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the terget: ");
        t = sc.nextInt();

        int l = 0, h = a.length - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (a[mid] == t) {
                System.out.println(mid);
            } else if (a[mid] < t) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        System.out.println("-1");
    }
}
