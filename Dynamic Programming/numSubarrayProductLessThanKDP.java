.java
/*
Example 1:
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.
Example 2:
Input: nums = [1,2,3], k = 0
Output: 0
*/

class Solution {
    public int numSubarrayProductLessThanKDP(ArrayList<Integer>arr, int k) {
        if(k <= 1) return 0;
        
        int n = arr.size();
        int dp[][] = new int[k+1][n+1];
        
        for(int i=1;i<=k;i++){
          for(int j=1;j<=n;j++){
            dp[i][j] = dp[i][j-1];
            if(arr.get(j-1) <= i && arr.get(j-1) > 0)
              dp[i][j] += sp[i/arr.get(j-1)][j-1] + 1;
          }
         }
        return dp[k][n];
        }
}
