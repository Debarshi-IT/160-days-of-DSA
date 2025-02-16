/*

Problem: 26
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

*/

import java.util.*;

public class Problem_26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String: ");
        String a=sc.nextLine();
        Stack<Character> st = new Stack<>();
        int n=a.length();
        boolean v=true;
        for(int i=0;i<n;i++){
            if(a.charAt(i)=='(' || a.charAt(i)=='{' || a.charAt(i)=='['){
                st.push(a.charAt(i));
            }
            else if (a.charAt(i) == ')' || a.charAt(i)== '}' || a.charAt(i) == ']'){
                if(st.isEmpty()){
                    v=false;
                    break;
                }
                char ch = st.pop();
                if((a.charAt(i) == ')' && ch != '(') ||  (a.charAt(i) == '}' && ch != '{') || (a.charAt(i) == ']' && ch != '[')){
                    v=false;
                    break;
                }
            }
        }
        if (!st.isEmpty()) {
            v = false;
        }
        if (v==true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}