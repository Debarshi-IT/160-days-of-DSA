/*

Problem: 50
You are given a 0-indexed integer array a of even length.
As long as a is not empty, you must repetitively:
Find the minimum number in a and remove it.
Find the maximum number in a and remove it.
Calculate the average of the two removed numbers.
The average of two numbers a and b is (a + b) / 2.
For example, the average of 2 and 3 is (2 + 3) / 2 = 2.5.
Return the number of distinct averages calculated using the above process.
Note that when there is a tie for a minimum or maximum number, any can be removed.

Example 1:
Input: a = [4,1,4,0,3,5]
Output: 2
Explanation:
1. Remove 0 and 5, and the average is (0 + 5) / 2 = 2.5. Now, a = [4,1,4,3].
2. Remove 1 and 4. The average is (1 + 4) / 2 = 2.5, and a = [4,3].
3. Remove 3 and 4, and the average is (3 + 4) / 2 = 3.5.
Since there are 2 distinct numbers among 2.5, 2.5, and 3.5, we return 2.

Example 2:
Input: a = [1,100]
Output: 1
Explanation:
There is only one average to be calculated after removing 1 and 100, so we return 1.

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Problem_50 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the array size: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Original array is: " + Arrays.toString(a));
        HashSet<Double> set = new HashSet<>();
        Arrays.sort(a);
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            double avg = (a[left] + a[right]) / 2.0;
            set.add(avg);
            left++;
            right--;
        }
        System.out.println(set.size());
    }
}
