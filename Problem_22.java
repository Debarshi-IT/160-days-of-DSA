/*

Problem: 22
Given an m x n integer a a, if an element is 0, set its entire row and column to 0's.

You must do it in place.

Example 1:
Input: a = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]

Example 2:
Input: a = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

*/

import java.util.*;

public class Problem_22 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter the row size: ");
        r=sc.nextInt();
        System.out.println("Enter the column size: ");
        c=sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter the elements: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              a[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("Original array is: "+Arrays.deepToString(a));
        int m = a.length;
        int n = a[0].length;
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }
        for (int row : zeroRows) {
            for (int j = 0; j < n; j++) {
                a[row][j] = 0;
            }
        }
        for (int col : zeroCols) {
            for (int i = 0; i < m; i++) {
                a[i][col] = 0;
            }
        }
        System.out.println("New Matrix is: "+Arrays.deepToString(a));
      }
}
