/*

Problem: 66
Given an integer array a and an integer k, split a into k non-empty subarrays such that the largest sum of any subarray is minimized.
Return the minimized largest sum of the split.
A subarray is a contiguous part of the array.


Example 1:
Input: a = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split a into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

Example 2:
Input: a = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split a into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

 */

 import java.util.Arrays;
 import java.util.Scanner;
 
 public class Problem_66 {
     public boolean check(int[] a, int k, int mid) {
         int count = 1; 
         int sum = 0; 
 
         for (int i = 0; i < a.length; i++) {
             if (a[i] + sum > mid) {
                 count++; 
                 sum = a[i]; 
             } else {
                 sum += a[i]; 
             }
         }
 
         return count <= k;
     }
 
     public int splitArray(int[] a, int k) {
         int l = Integer.MIN_VALUE; 
         int r = 0; 
         int res = 0;
 
         for (int i = 0; i < a.length; i++) {
             r += a[i];
             l = Math.max(l, a[i]);
         }
 
         while (l <= r) {
             int mid = (l + r) / 2;
             if (check(a, k, mid)) {
                 res = mid; 
                 r = mid - 1; 
             } else {
                 l = mid + 1; 
             }
         }
 
         return res; 
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         System.out.print("Enter the array size: ");
         int m = sc.nextInt();
 
         int[] a = new int[m];
         System.out.println("Enter the elements: ");
         for (int i = 0; i < m; i++) {
             a[i] = sc.nextInt();
         }
         System.out.println("Array: " + Arrays.toString(a));
 
         System.out.print("Enter the number of subarrays (k): ");
         int k = sc.nextInt();
 
         Problem_66 obj = new Problem_66();
         int result = obj.splitArray(a, k);
         
         System.out.println("The minimized largest sum after splitting is: " + result);
     }
 }
 