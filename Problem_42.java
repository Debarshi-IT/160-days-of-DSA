/*

Problem: 42
Given two strings ne and hs, return the index of the first occurrence of ne in hs, or -1 if ne is not part of hs.

Example 1:
Input: hs = "sadbutsad", ne = "sad"
Output: 0

Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: hs = "leetcode", ne = "leeto"
Output: -1

Explanation: "leeto" did not occur in "leetcode", so we return -1.

*/

import java.util.Scanner;

public class Problem_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your haystack: ");
        String hs = sc.nextLine();
        System.out.println("Enter your needle: ");
        String ne = sc.nextLine();

        if(ne.isEmpty()){
            System.out.println("0");
        }
        if(hs.contains(ne)){
           System.out.println( hs.indexOf((ne)));
        }
        System.out.println("-1");
    }
}
