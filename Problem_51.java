/*

Problem: 51
Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.
If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

Example 1:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"

Example 2:
Input: s = "abcd", k = 2
Output: "bacd"

 */

import java.util.Scanner;

public class Problem_51 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        System.out.println("Enter your Number: ");
        int k = sc.nextInt();
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i += 2 * k) {
            int l = i;
            int e = Math.min(i + k - 1, a.length - 1);
            while (l < e) {
                char temp = a[l];
                a[l] = a[e];
                a[e] = temp;
                l++;
                e--;
            }
        }
        s = new String(a);
        System.out.println("" + s);
    }
}
