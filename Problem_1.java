/*

Problem 1:
Given an array of positive integers arr[], return the second largest element from the array.
If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.

*/

//Solution of the problem (Type 1)
import java.util.*;

public class Problem_1{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
class Solution {
    public int getSecondLargest(int[] arr) {
        int max=0,smax = 0;
        for(int value:arr){
            if(value>max) {
                smax = max;
                max=value;
            }else if(value > smax && value != max){
                smax = value;
            }
        }
        if(smax == 0) return -1;
        return smax;
    }

}

// Solution of the problem (Type 2)
import java.util.*;
public class Problem_1{
    void SecondLargest(int[] arr){
        int s=arr.length;
        Arrays.sort(arr);
        int i;
        int l=arr[s-1];
        for(i=s-2;i>=0;i--){
            if(arr[i]<l){
                System.out.println("Second Largest number is:"+arr[i]);
                return;
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        Problem_1 sc= new Problem_1();
        int[] arr={12, 35, 1, 10, 34, 1};
        sc.SecondLargest(arr);
        int[] arr1={2, 1, 7, 8, 10, 10};
        sc.SecondLargest(arr1);
        int[] arr2={15, 15, 15};
        sc.SecondLargest(arr2);
    }
}