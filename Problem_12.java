/*

Problem : 12
Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

Examples:

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: 1 2 3 4 5 6 7
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.

Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: 1 2 3 4 5
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.

Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: 1 2
Explanation: Distinct elements including both the arrays are: 1 2.

 */

import java.util.*;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,n1;
        System.out.println("Enetr the 1st array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enetr the elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enetr the 2nd array size: ");
        n1=sc.nextInt();
        int[] b=new int[n1];
        System.out.println("Enetr the elements: ");
        for(i=0;i<n1;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("Original 1st array is: "+Arrays.toString(a));
        System.out.println("Original 2nd array is: "+Arrays.toString(b));

        //create a set
        Set<Integer> us=new HashSet<>();
        //insert elements of 1st array into set.
        for(int t : a){
            us.add(t);
        }
        //insert elements of 2nd array into set.
        for (int t: b) {
            us.add(t);
        }
        System.out.println("Union of two arrays : "+us);
    }
}
