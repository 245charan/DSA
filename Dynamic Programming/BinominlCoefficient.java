/*

Expected Time Complexity: O(n*r)
Expected Auxiliary Space: O(r)

Example 1:

Input: n = 3, r = 2
Output: 3
Explaination: 3C2 = 3. 

Example 2:

Input: n = 2, r = 4
Output: 0
Explaination: r is greater than n.

*/

class Solution{
    static int nCr(int n, int r)
    {
        // code here
        if(n<r) return 0;
        if((n-r)<r) r=n-r;
        int mod = 1000000007;
        
        int dp[] = new int[r+1];
        dp[0] = 1;
        for(int i=1; i<=n;i++){
            for(int j=Math.min(r,i);j>0;j--){
                dp[j] = (dp[j] +  dp[j-1])%mod;
            }
            
        }
       return dp[r]; 
    }
};
