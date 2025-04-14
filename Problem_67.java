/*

Problem  67
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

Example 2:
Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_67 {

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

        System.out.print("Enter the number : ");
        int k = sc.nextInt();

        for (int i : a) {
            if (i <= k) {
                k++;
            } else {
                break;
            }
        }
        System.out.println(k);

    }
}
