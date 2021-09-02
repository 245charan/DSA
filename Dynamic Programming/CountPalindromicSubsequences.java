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
    final long mod = 1000000007;
    long add(long x, long y) {
        return ((x % mod) + (y % mod)) % mod;
    }
    long sub(long x, long y) {
        return ((x % mod) - (y % mod) + mod) % mod;
    }

	long countPS(String str)
{
    int N = str.length();
 
    // create a 2D array to store the count of palindromic
    // subsequence
    long cps[][] = new long[N+1][N+1];
    for (int i=0; i<N; i++)
        cps[i][i] = 1;
	char str1[] = str.toCharArray();
    // check subsequence of length L is palindrome or not
    for (int L=2; L<=N; L++)
    {
        for (int i=0; i<=N-L; i++)
        {
            int k = L+i-1;
            if (str1[i] == str1[k])
                cps[i][k] = add(cps[i][k-1] ,
                            cps[i+1][k] + 1)%mod;
            else
                cps[i][k] = add(cps[i][k-1] ,
                            sub(cps[i+1][k] ,
                            cps[i+1][k-1]))%mod;
        }
    }
    return cps[0][N-1];
}
}







// C++ solution 
class Solution
{
    long countPS(String s)
    {
     long long int mod = 1000000007;
     int n = s.length();
     int dp[n][n];
     for(int g = 0; g < n; g++){
      for(int j = g, i = 0; j < n; i++, j++){
       if(g == 0){
        dp[i][j] = 1;
       }
       else if(g == 1){
        if(s[i] == s[j]) dp[i][j] = 3;
        else dp[i][j] = 2;
       }
       else if(s[i] == s[j]){
        dp[i][j] = (dp[i][j-1]+ dp[i+1][j] + 1) % mod;
       }
       else{
        long long a = (dp[i][j-1] + dp[i+1][j])%mod;
        long long b = dp[i+1][j-1];
        dp[i][j] = ((a - b) % mod + mod) % mod;
       }
      }
     }
     return dp[0][n-1];
    }
}
