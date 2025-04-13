/*

Problem: 65
Given two sorted arrays a and b of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example 1:
Input: a = [1,3], b = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example 2:
Input: a = [1,2], b = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int m = sc.nextInt();

        int[] a = new int[m];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int[] b = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(b));

        int[] arr = new int[m + n];
        int m1 = 0, n1 = 0, i = 0;
        double median;

        // Merge a and b into arr[]
        while (m1 < m && n1 < n) {
            if (a[m1] <= b[n1]) {
                arr[i++] = a[m1++];
            } else {
                arr[i++] = b[n1++];
            }
        }

        // Copy remaining elements from a
        while (m1 < m) {
            arr[i++] = a[m1++];
        }

        // Copy remaining elements from b
        while (n1 < n) {
            arr[i++] = b[n1++];
        }

        // Find the median
        int len = m + n;
        if (len % 2 == 0) {
            median = (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        } else {
            median = arr[len / 2];
        }

        System.out.println(median);
    }
}
