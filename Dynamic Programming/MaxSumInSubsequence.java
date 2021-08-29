//  Expected Time Complexity: O(N^2) Expected Auxiliary Space: O(N)


/*
 
 Example 1:

Input: N = 5, arr[] = {1, 101, 2, 3, 100} 
Output: 106
Explanation:The maximum sum of a
increasing sequence is obtained from
{1, 2, 3, 100}
Example 2:

Input: N = 3, arr[] = {1, 2, 3}
Output: 6
Explanation:The maximum sum of a
increasing sequence is obtained from
{1, 2, 3}

*/
class Solution
{
	public int MaxSumInSubsequence(int arr[], int n)  
	{  
	    //code here.
	    int max=0;
	    int[] dp = new int[n];
	    for(int i=0;i<n;i++){
	        dp[i] = arr[i];
	    }
	    
	// Computing maximum sum value in bottom up manner
	    for(int i=1;i<n;i++){
	       for(int j=0;j<i;j++){
	           if(arr[i]>arr[j] && dp[i]<dp[j]+arr[i] )
	            dp[i]=dp[j]+arr[i];
	       }
	    }
	    for(int i=0;i<n;i++){
	        max = Math.max(max,dp[i]);
	    }
	    return max;
	}  
}
