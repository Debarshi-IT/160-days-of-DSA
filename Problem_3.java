/*

Problem 3:
You are given an array arr[] of non-negative integers.
Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements.
The operation must be performed in place, meaning you should not use extra space for another array.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.

*/

import java.util.*;
public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        int c=0;
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The original array is: "+Arrays.toString(a));
        for(i=0;i<n;i++){
            if(a[i] != 0){
                a[c++]=a[i];
            }
           
        }
        while(c<n){
            a[c++]=0;
        }
        System.out.println("New array is: "+Arrays.toString(a));
    }
}
