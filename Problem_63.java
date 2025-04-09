/*

Problem: 63
Given an array of integers a and an integer d, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to d.
Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
The test cases are generated so that there will be an answer.

Example 1:
Input: a = [1,2,5,9], d = 6
Output: 5
Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 

Example 2:
Input: a = [44,22,33,11,1], d = 5
Output: 44

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        System.out.println("Enter the Threshold: ");
        int d = sc.nextInt();

        int low = 1, high = 1000000;

        while (low < high) {
            int mid = (low + high) >> 1;

            int sum = 0;
            for (int num : a) {
                sum += (num + mid - 1) / mid;
            }

            if (sum <= d) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(low);
    }
}
