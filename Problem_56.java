/*

Problem: 56
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1

*/

import java.util.Scanner;

public class Problem_56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Seats array size: ");
         int n = sc.nextInt();
         
         int[] a = new int[n];
         System.out.println("Enter the elements: ");
         for (int i = 0; i < n; i++) {
             a[i] = sc.nextInt();
         }
 
         System.out.println("Enter the target: ");
         int t = sc.nextInt();
         int ans = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] == t){
                ans = i;
                break;
            }

        }
        System.out.println(ans);
    }
}
