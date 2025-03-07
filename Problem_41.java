/*

Problem: 41
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int nr);
 

Example 1:
Input: s = "PAYPALISHIRING", nr = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", nr = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

Example 3:
Input: s = "A", nr = 1
Output: "A"

*/

import java.util.Scanner;

public class Problem_41 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        System.out.println("Enter the row number: ");
        int nr=sc.nextInt();
        StringBuffer [] arr = new StringBuffer[nr]; 
        for(int i=0; i<nr; i++) arr[i] = new StringBuffer();
        int n=s.length();
        int i=0;
        while(i<n){
            for(int ind=0; ind<nr && i<n; ind++){
                arr[ind].append(s.charAt(i++));
            }
            for(int ind=nr-2; ind>0 && i<n; ind--){
                arr[ind].append(s.charAt(i++));
            }
        }
        StringBuffer ans = new StringBuffer();
        for(StringBuffer el : arr){
            ans.append(el);
        }
        System.out.println(ans.toString()); 
    }
}
