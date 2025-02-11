/*


Given an integer array a, return all the triplets [a[i], a[j], a[k]] such that i != j, i != k, and j != k, and a[i] + a[j] + a[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: a = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Explanation: 
a[0] + a[1] + a[2] = (-1) + 0 + 1 = 0.
a[1] + a[2] + a[4] = 0 + 1 + (-1) = 0.
a[0] + a[3] + a[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the o and the order of the triplets does not matter.

Example 2:
Input: a = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: a = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.

*/

import java.util.*;

public class Problem_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the array size: ");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is: "+Arrays.toString(a));
        int target = 0;
        Arrays.sort(a);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> o = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
            int j = i + 1;
            int k = a.length - 1;
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum == target) {
                    s.add(Arrays.asList(a[i], a[j], a[k]));
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        o.addAll(s);
        System.out.println("The distinct triplets are: "+o);      
    }
}
