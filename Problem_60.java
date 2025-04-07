/*

Problem: 60
A peak element is an element that is strictly greater than its neighbors.
Given a 0-indexed integer array a, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
You may imagine that a[-1] = a[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
You must write an algorithm that runs in O(log n) time.

Example 1:
Input: a = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:
Input: a = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_60 {

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

        int s = 0, e = a.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;
            if ((m + 1) < a.length && a[m] > a[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        System.out.println(s);
    }
}
