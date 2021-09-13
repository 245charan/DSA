


/*Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Example 1:

Input:
N = 6
Arr[] = {5, 5, 10, 100, 10, 5}
Output: 110
Explanation: If you take indices 0, 3
and 5, then Arr[0]+Arr[3]+Arr[5] =
5+100+5 = 110.
Example 2:

Input:
N = 4
Arr[] = {3, 2, 7, 10}
Output: 13
Explanation: 3 and 10 forms a non
continuous  subsequence with maximum
sum.
*/


class Solution {
    int findMaxSum(int hval[], int n) {
        
        if (n == 0)
        return 0;
  
        int value1 = hval[0];
        if (n == 1)
            return value1;
  
        int value2 = Math.max(hval[0], hval[1]);
        if (n == 2)
            return value2;
   
        // contains maximum stolen value at the end
        int max_val = 0;
  
        // Fill remaining positions
        for (int i=2; i<n; i++)
        {
            max_val = Math.max(hval[i]+value1, value2);
            value1 = value2;
            value2 = max_val;
        }
  
        return max_val;
    }
}
