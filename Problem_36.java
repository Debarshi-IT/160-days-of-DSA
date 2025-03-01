/*

Problem: 36
Given a string s, return the longest palindromic substring in s.

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

 */

import java.util.Scanner;

public class Problem_36 {

    static int max = 0, st = 0, e = 0;

    public static boolean ispalin(String s, int i, int j) {
        while (i < j) {
            char c = s.charAt(i);
            char c1 = s.charAt(j);
            if (c != c1) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (ispalin(s, i, j) == true) {
                    if ((j - i + 1) > max) {
                        max = j - i + 1;
                        st = i;
                        e = j;
                    }
                }
            }
        }
        System.out.println("Longest Palindromic Substring: " + s.substring(st, e + 1));
    }
}
