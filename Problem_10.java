/*

Problem: 10
Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.

Examples:

Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
Output: 6
Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10].
The length of the longest subarray with a sum of 15 is 6.

Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5
Output: 5
Explanation: Only subarray with sum = 15 is [-5, 8, -14, 2, 4] of length 5.

Input: arr[] = [10, -10, 20, 30], k = 5
Output: 0
Explanation: No subarray with sum = 5 is present in arr[].

*/

import java.util.*;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,t,k,s=0,r=0;
        System.out.println("Enetr the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enetr the elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(a));
        System.out.println("Enter the sum of subarray: ");
        k=sc.nextInt();
        for (i=0;i<n;i++){
            for(j=i;j<n;j++){
                s += a[j];
                if(s==k){
                    t=j-i+1;
                    r=Math.max(r,t);
                }
            }
        }
        System.out.println("Sorted array is: "+r);
    }
}
