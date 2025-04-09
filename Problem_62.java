/*

Problem: 62
Koko loves to eat bananas. There are n a of bananas, the ith pile has a[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1:
Input: a = [3,6,7,11], h = 8
Output: 4

Example 2:
Input: a = [30,11,23,4,20], h = 5
Output: 30

Example 3:
Input: a = [30,11,23,4,20], h = 6
Output: 23
 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_62 {

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

        System.out.println("Enter the Hours: ");
        int h = sc.nextInt();

        int minS = 1;
        int maxS = (int) 1e9;

        // binary Search
        while (minS < maxS) {
            int midS = minS + (maxS - minS) / 2;

            int time = 0;

            for (int p : a) {
                time += (p + midS - 1) / midS;
            }

            if (time <= h) {
                maxS = midS;
            } else {
                minS = midS + 1;
            }
        }
        System.out.println(minS);
    }
}
