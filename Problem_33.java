/*


Given two strings s and t, return true if t is an anagram 6of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false

 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem_33 {
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
        char[] x=s.toCharArray();
        char[] y=g.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);
        
        if(Arrays.equals(x, y)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
