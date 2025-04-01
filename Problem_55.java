/*

Problem: 55
Given an array of integers a sorted in non-decreasing order, find the starting and ending position of a given t value.
If t is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: a = [5,7,7,8,8,10], t = 8
Output: [3,4]

Example 2:
Input: a = [5,7,7,8,8,10], t = 6
Output: [-1,-1]

Example 3:
Input: a = [], t = 0
Output: [-1,-1]

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_55 {
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

         int arr[] = {-1, -1};
        int si = 0;
        int ei = a.length - 1;
        
        while (si <= ei) { 
            int mid = si + (ei - si) / 2; 
            
            if (a[mid] > t) {
                ei = mid - 1;
            } else if (a[mid] < t) {
                si = mid + 1;
            } else {
                int fi = mid;
                int li = mid;
                while (fi > 0 && a[fi - 1] == t) {
                    fi--;
                }
                while (li < a.length - 1 && a[li + 1] == t) {
                    li++;
                }
                arr[0] = fi;
                arr[1] = li;
                break;
            }
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
