/*

Problem: 32
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
A shift on s consists of moving the leftmost character of s to the rightmost position.
For example, if s = "abcde", then it will be "bcdea" after one shift.
 
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:
Input: s = "abcde", goal = "abced"
Output: false

*/

import java.util.Scanner;

public class Problem_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s=sc.nextLine();
        System.out.println("Enter your goal String: ");
        String g=sc.nextLine();
        if(s.length() != g.length()){
            System.out.println("False");
            return;
        }
        String r=s+s;
        if(r.contains(g)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
