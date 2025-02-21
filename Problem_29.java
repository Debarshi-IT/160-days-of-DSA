/*

Problem: 29
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Explanation:
The strings s and t can be made identical by:
Mapping 'e' to 'a'.
Mapping 'g' to 'd'.

Example 2:
Input: s = "foo", t = "bar"
Output: false

Explanation:
The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:
Input: s = "paper", t = "title"
Output: true

 */

import java.util.HashMap;
import java.util.Scanner;

public class Problem_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your 1st String: ");
        String s=sc.nextLine();
        System.out.println("Enter your 2nd String: ");
        String t=sc.nextLine();

        System.out.println("Output: "+Isomorphic(s, t));

    }
    public static boolean Isomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            if (mapS.containsKey(charS)) {
                if (mapS.get(charS) != charT) {
                    return false;
                }
            } else {
                mapS.put(charS, charT);
            }
            
            if (mapT.containsKey(charT)) {
                if (mapT.get(charT) != charS) {
                    return false;
                }
            } else {
                mapT.put(charT, charS);
            }
        }
        return true;
    }
}
