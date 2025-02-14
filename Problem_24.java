/*
Given an m x n a, return all elements of the a in spiral order.

Example 1:
Input: a = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input: a = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

*/

import java.util.*;

public class Problem_24 {
    public static List<Integer> so(int[][] a) {
        List<Integer> result = new ArrayList<>();
        if (a == null || a.length == 0){
            return result;
        } 
        int t = 0, l = 0;
        int b = a.length - 1;
        int r = a[0].length - 1;
        while (t <= b && l <= r) {
            // Traverse from l to r
            for (int i = l; i <= r; i++)
                result.add(a[t][i]);
            t++;
            // Traverse from t to b
            for (int i = t; i <= b; i++)
                result.add(a[i][r]);
            r--;
            // Traverse from r to l (if still in bounds)
            if (t <= b) {
                for (int i = r; i >= l; i--)
                    result.add(a[b][i]);
                b--;
            }
            // Traverse from b to t (if still in bounds)
            if (l <= r) {
                for (int i = b; i >= t; i--)
                    result.add(a[i][l]);
                l++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Enter the a elements row-wise:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        List<Integer> sr = so(a);
        System.out.println("Spiral Order: " + sr);
        scanner.close();
    }
}