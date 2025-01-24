/* 

Problem 9:
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

You can find a slight modification of the problem here.
Note: It is compulsory to increase or decrease the height by K for each tower.
After the operation, the resultant array should not contain any negative integers.

Examples :

Input: k = 2, arr[] = {1, 5, 8, 10}
Output: 5
Explanation: The array can be modified as {1+k, 5-k, 8-k, 10-k} = {3, 3, 6, 8}.The difference between the largest and the smallest is 8-3 = 5.

Input: k = 3, arr[] = {3, 9, 12, 16, 20}
Output: 11
Explanation: The array can be modified as {3+k, 9+k, 12-k, 16-k, 20-k} -> {6, 12, 9, 13, 17}.The difference between the largest and the smallest is 17-6 = 11. 

*/

import java.util.*;
public class Problem_9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k,i;
        System.out.println("Enetr the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enetr the elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(a));
        System.out.println("Enetr a positive integer k: ");
        k=sc.nextInt();

        Arrays.sort(a);

        int difference=a[n-1]-a[0];
        int smallest=a[0]+k;
        int largest=a[n-1]-k;

        int mi,ma;
        for(i=0;i<n-1;i++){
            mi=Math.min(smallest,a[i+1]-k);
            ma=Math.max(largest,a[i]+k);
            if(mi<0){
                continue;
            }
            difference=Math.min(difference,ma-mi);
        }
        System.out.println("The difference between the largest and the smallest is: "+difference);
    }
}
