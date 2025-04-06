/*

Problem: 59
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: a = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: a = [3,3,7,7,10,11,11]
Output: 10

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_59 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        if (a.length == 1) {
            System.out.println(a[0]);
        }
        int l = 0;
        int h = a.length - 1;

        while (l < h) {
            int mid = l + (h - l) / 2;

            if (a[mid] == a[mid + 1]) {
                mid = mid - 1;
            }
            if ((mid - l + 1) % 2 != 0) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }

        System.out.println("Output: " + a[l]);
    }
}
