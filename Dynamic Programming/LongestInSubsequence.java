/*
Expected Time Complexity : O( N*log(N) )
Expected Auxiliary Space: O(N)
    Example 1:

    Input:
    N = 16
    A[]={0,8,4,12,2,10,6,14,1,9,5
         13,3,11,7,15}
    Output: 6
    Explanation:Longest increasing subsequence
    0 2 6 9 13 15, which has length 6
    Example 2:

    Input:
    N = 6
    A[] = {5,8,3,7,9,1}
    Output: 3
    Explanation:Longest increasing subsequence
    5 7 9, with length 3
*/


class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int n, int arr[])
    {
        // code here
        int max=0;
	    int[] dp = new int[n];
	    dp[0] = 1;
	    
	    // Computing Longest sequence in Bottom up manner
	    
	    for(int i=1;i<n;i++){
	        dp[i]=1;
	       for(int j=0;j<i;j++){
	           if(arr[i]>arr[j] && dp[i]<1+dp[j] )
	            dp[i]=1+dp[i];
	       }
	    }
	    for(int i=0;i<n;i++){
	        max = Math.max(max,dp[i]);
	    }
	    return max;
    }
}
