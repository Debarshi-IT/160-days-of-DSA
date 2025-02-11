/*
 
Problem: 20
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9

*/

import java.util.Arrays;
import java.util.Scanner;

public class Problem_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(a));
        if (a.length == 0)
            System.out.println(0);
        Arrays.sort(a);
        int m=1;
        int t=1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]){
                continue;
            }               
            else if (a[i] + 1 == a[i + 1]) {
                t++;
            } 
            else {
                m = Math.max(m, t);
                t=1;
            }
        }
        int k=m > t ? m : t;
        System.out.println("The length of the longest consecutive elements sequence is: "+k);
    }
}
