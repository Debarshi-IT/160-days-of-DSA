/*

Problem: 35
Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3

Explanation:
Digit 8 is inside of 3 nested parentheses in the string.

Example 2:
Input: s = "(1)+((2))+(((3)))"
Output: 3

Explanation:
Digit 3 is inside of 3 nested parentheses in the string.

Example 3:
Input: s = "()(())((()()))"
Output: 3

 */

import java.util.Scanner;

public class Problem_35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        int m = 0;
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                c++;
            } else if (ch == ')') {
                m = Math.max(m, c);
                c--;
            }
        }
        System.out.println("Output: " + m);
    }
}
