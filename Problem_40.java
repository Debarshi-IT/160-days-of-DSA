/*

Problem: 40
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        int start = 0 ;
        int end = 0 ;
        int maxL = 0 ;

        Set<Character> charset = new HashSet<>() ;

        while(end < s.length())
        {
            if(!charset.contains(s.charAt(end)))
            {
                charset.add(s.charAt(end));
                end++ ;
                maxL = Math.max(maxL , charset.size());
            }else{
                charset.remove(s.charAt(start));
                start++;
            }
        }
        System.out.println(maxL);
    }
}
