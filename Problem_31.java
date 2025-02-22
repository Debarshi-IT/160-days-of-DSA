/*

Problem: 31
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */

 import java.util.Arrays;
 import java.util.Scanner;
 
 public class Problem_31 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter the number of strings: ");
         int n = sc.nextInt();
         sc.nextLine(); 
 
         String[] s = new String[n];
         System.out.println("Enter your strings:");
         for (int i = 0; i < n; i++) {
             s[i] = sc.nextLine();
         }
         Arrays.sort(s); 
         StringBuilder r = new StringBuilder();
         char[] f = s[0].toCharArray(); 
         char[] l = s[n - 1].toCharArray();
 
         for (int i = 0; i < f.length && i < l.length; i++) {
             if (f[i] != l[i]) {
                 break;
             }
             r.append(f[i]); 
         }
         System.out.println("Output: " + r.toString());
         sc.close(); 
     }
 }
 
