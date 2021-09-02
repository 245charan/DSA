/*
Expected Time Complexity: O(N*N)
Expected Auxiliary Space: O(N*N)

Example 1:

Input: 
Str = "abcd"
Output: 
4
Explanation:
palindromic subsequence are : "a" ,"b", "c" ,"d"
 

Example 2:

Input: 
Str = "aab"
Output: 
4
Explanation:
palindromic subsequence are :"a", "a", "b", "aa"
 
*/

class Solution
{
    long countPS(String str)
    {
       int n = str.length();
        int mod = 1000000007;
        long[][] dp = new long[n][n];
        for(int gap = 0;gap<n;gap++){
            for(int i=0;i<n-gap;i++){
                int j = i+gap;
                if(i==j){
                    dp[i][j] = 1;
                }else if(str.charAt(i) == str.charAt(j)){
                    dp[i][j] = (dp[i+1][j] + dp[i][j-1] + 1) % mod;
                }else{
                    dp[i][j] = (dp[i+1][j] + (dp[i][j-1] - dp[i+1][j-1])) % mod;
                    if(dp[i][j] < 0)dp[i][i] +=mod;
                }
            }
        }
        return dp[0][n-1];
    }
}
