/*
Expected Time Complexity: O(N).
Expected Space Complexity: O(N).


Input:
n = 6
a[] = {5,5,10,100,10,5}
Output: 110
Explanation: 5+100+5=110
Example 2:

Input:
N = 4
Arr[] = {3, 2, 7, 10}
Output: 13
Explanation: 3 and 10 forms a non
continuous  subsequence with maximum
sum.

Input:
n = 3
a[] = {1,2,3}
Output: 4
Explanation: 1+3=4
*/

class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        if(n==0) return 0;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        int dp[] = new[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
        }
        return dp[n-1];
    }
}
