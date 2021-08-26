// TC->O(n*k) SC -> O(n*k)

class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int n, int k) 
	{
	    int dp[][] = new int[n+1][k+1];
        int res;
        int i,j,x;
        
        for(i=1;i<=n;i++){
            dp[i][1] = 1;
            dp[i][0] = 0;
        }
        
        for(i=1;i<=k;i++){
            dp[1][i] = i;
        }
        
        for(i = 2;i<=n;i++){
            for(j=2;j<=k;j++){
                dp[i][j] = Integer.MAX_VALUE;
                for(x=1;x<=j;x++){
                    res=1+Math.max(dp[i-1][x-1],dp[i][j-x]);
                    if(res<dp[i][j]){
                        dp[i][j] = res;
                    }
                }
            }
        }
        return dp[n][k];
	}
}
