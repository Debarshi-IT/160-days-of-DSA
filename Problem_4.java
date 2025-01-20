/*

Problem 4:
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer.
Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.

Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.

Input: arr[] = [7, 3, 9, 1], d = 9
Output: [3, 9, 1, 7]
Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.

*/

import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,d,i,j;
        System.out.println("Enetr the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enetr the elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(a));
        System.out.println("Enetr the d steps, where d is a positive integer: ");
        d=sc.nextInt();
        for(i=0;i<d;i++){
            int k=a[0];
            for(j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[j]=k;
        }
        System.out.println("The new array is: ");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
