/*

Problem: 17
Given an integer array nums, find the  subarray with the largest sum, and return its sum.

Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

*/

import  java.util.*;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        System.out.println("Enter the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(a));
        int r=a[0];
        for(i=0;i<n;i++){
            s+=a[i];
            r=Math.max(r,s);
            if(s<0){
                s=0;
            }
        }
        System.out.println("The largest sum is: "+r);

    }
}