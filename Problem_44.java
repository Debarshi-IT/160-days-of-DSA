/*

Problem: 44
You are given an integer array a where a[i] is the price of the ith item in a shop.
There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to a[j] where j is the minimum index such that j > i and a[j] <= a[i]. Otherwise, you will not receive any discount at all.
Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.

Example 1:
Input: a = [8,4,6,2,3]
Output: [4,2,4,2,3]
Explanation: 
For item 0 with price[0]=8 you will receive a discount equivalent to a[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
For item 1 with price[1]=4 you will receive a discount equivalent to a[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
For item 2 with price[2]=6 you will receive a discount equivalent to a[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
For items 3 and 4 you will not receive any discount at all.

Example 2:
Input: a = [1,2,3,4,5]
Output: [1,2,3,4,5]
Explanation: In this case, for all items, you will not receive any discount at all.

Example 3:
Input: a = [10,1,1,6]
Output: [9,0,1,6]

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the array size: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Original array is: " + Arrays.toString(a));
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] <= a[i]) {
                    a[i] -= a[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
