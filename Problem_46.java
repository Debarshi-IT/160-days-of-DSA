/*

Problem:46
Given a 0-indexed string s and a character ch, reverse the segment of s that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in s, do nothing.
For example, if s = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

Example 1:
Input: s = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of s from 0 to 3 (inclusive), the resulting string is "dcbaefd".

Example 2:
Input: s = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of s from 0 to 3 (inclusive), the resulting string is "zxyxxe"

Example 3:
Input: s = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in s.
You should not do any reverse operation, the resulting string is "abcd".

 */

import java.util.Scanner;

public class Problem_46 {

    public static String RevPrif(String s, char ch) {
        int index = s.indexOf(ch);
        if (index == -1) {
            return s;
        }
        StringBuilder reversed = new StringBuilder(s.substring(0, index + 1)).reverse();
        return reversed.toString() + s.substring(index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Word: ");
        String s = scanner.next();

        System.out.print("Enter the character: ");
        char ch = scanner.next().charAt(0);
        String result = RevPrif(s, ch);
        System.out.println("Result string: " + result);
    }
}
