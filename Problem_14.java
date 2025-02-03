/*
 
Problem: 14
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

 
Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_14 {
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
        int s=0;
        for(int j : a){
            s= s^j;
        }
        System.out.println("the single element is: "+s);
    }
}
