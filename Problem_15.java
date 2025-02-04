/*
 
Problem: 15
Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_15 {
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
        int c=0;
        int r=0;
        for(int j:a){
            if(j==1){
                c=c+1;
                r=Math.max(r,c);
            }
            else{
                c=0;
            }
        }
        System.out.println("the maximum number of consecutive 1's in the array: "+r);
    }
}
