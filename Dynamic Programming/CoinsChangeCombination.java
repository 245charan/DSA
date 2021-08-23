// Method 1 using 1D array

public long count(int S[], int m, int n) 
    { 
        long table[] = new long[n + 1];
        for(int i = 0;i<n+1;i++)
            table[i] = 0;
        table[0] = 1;
        for(int i=0; i<m; i++)
            for(int j=S[i]; j<=n; j++)
                table[j] += table[j-S[i]];
     
        return table[n];
       
    } 

// Method 2 using 2D Array
class Solution
{
    public long count(int S[], int m, int n) 
    { 
        //code here.
        long[][] dp=new long[m+1][n+1];

        // Initialization
        for(int i=0;i < m+1;i++)
        for(int j=0;j < n+1;j++){
            if(i==0) dp[i][j]=0;
            if(j==0) dp[i][j]=1;
        }

        // Iteration
        for(int i=1;i < m+1;i++)
        for(int j=1;j < n+1;j++)
        if(S[i-1] <= j)
        dp[i][j]=dp[i][j-S[i-1]] + dp[i-1][j];
        else
        dp[i][j]=dp[i-1][j];

        return dp[m][n];

    } 
}