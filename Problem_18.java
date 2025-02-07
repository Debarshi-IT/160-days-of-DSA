/*

Problem: 18
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

*/

import java.util.*;

public class Problem_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(a));
        Arrays.sort(a);
        int x=a[n/2];
        System.out.println("The majority element is: "+x);
    }
}
