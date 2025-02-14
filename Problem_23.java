/*

Problem: 23
You are given an n x n 2D a representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D a directly.
DO NOT allocate another 2D a and do the rotation.

Example 1:
Input: a = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
Input: a = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

*/

import java.util.*;

public class Problem_23 {
    public static void rotate(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int t = a[i][j];
                a[i][j] = a[i][n - j - 1];
                a[i][n - j - 1] = t;
            }
        }
    }
    public static void printMatrix(int[][] a) {
        for (int[] row : a) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
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
        System.out.println("Original Matrix:");
        printMatrix(a);
        rotate(a);
        System.out.println("Rotated Matrix:");
        printMatrix(a);
    }
}