/*

Problem: 7
The task is to complete the insertsort() function which is used to implement Insertion Sort.

Examples:

Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
Explanation: The sorted array will be [1, 3, 4, 7, 9].

Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Explanation: The sorted array will be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].

Input: arr[] = [4, 1, 9]
Output: [1, 4, 9]
Explanation: The sorted array will be [1, 4, 9].

 */

 import java.util.*;

public class Problem_7 {
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

        for(i=0;i<n;i++){
            t=a[i];
            for(j=i-1;j>=0 && a[j]>t;j--){
                a[j+1]=a[j];
            }
            a[j+1]=t;
        }
        
        System.out.println("Sorted array is: "+Arrays.toString(a));
    }
}
