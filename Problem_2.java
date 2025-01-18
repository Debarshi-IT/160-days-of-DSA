/*

Problem 2:
You are given an array of integers arr[]. Your task is to reverse the given array.

Note: Modify the array in place.

Examples:

Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are 1 4 3 2 6 5.
After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on.
Hence, the answer is 5 6 2 3 4 1.

Input: arr = [4, 5, 2]
Output: [2, 5, 4]
Explanation: The elements of the array are 4 5 2. The reversed array will be 2 5 4.
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.

*/

import java.util.*;
public class Problem_2 {
    public static void main(String[] args) {
        //int[] a={10,4,7,5,2,1};
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enetr the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Current array is: "+Arrays.toString(a));
        int s= a.length;
        System.out.println("Reverse array is: ");
        for(int i=s-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }
}
