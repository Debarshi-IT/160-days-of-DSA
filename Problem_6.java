/*
 
Problem: 6
Given an array, arr[]. Sort the array using bubble sort algorithm.

Examples :

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]

Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Input: arr[] = [1, 2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]

Explanation: An array that is already sorted should remain unchanged after applying bubble sort.

 */

import java.util.*;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,t;
        System.out.println("Enetr the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enetr the elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(a));
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Sorted array is: "+Arrays.toString(a));
    }
}
