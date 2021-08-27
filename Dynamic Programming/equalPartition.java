// TC -> O(N*sum of elements) SC -> O(sum of elements)
/*
	Input: N = 4
	arr = {1, 5, 11, 5}
	Output: YES
	Explaination: 
	The two parts are {1, 5, 5} and {11}.
*/

// Method 1
class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2!=0) return 0;
        
        sum/=2;
        int[] dp = new int[sum+1];
        dp[0] = 1;
        for(int i:arr){
            for(int j = sum;j>=i;j--){
                dp[j] = dp[j] | dp[j-i];
            }
        }
        return dp[sum];
    }
}

// TC -> O(N*sum of elements) SC -> O(N*sum of elements)
// Method 2
class Solution{
    static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        for(int i = 0;i < N;i++)
            sum = sum + arr[i];
        if(sum%2 == 1)
            return 0;
        sum = sum/2;
        boolean[][] dp =new boolean[N+1][sum+1];
	    
	    for(int i= 0;i<dp.length;i++)
	        dp[i][0] = true;
	    
	    for(int i= 1;i<dp.length;i++)
	        dp[0][i] = false;
	     
	    for(int i = 1;i <= N;i++){
	        for(int j = 1;j <= sum;j++){
	            if(arr[i-1] > j){
	                dp[i][j] = dp[i-1][j];
	            }
	            else{
	                dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
	            }
	        }
	    }
	    return (dp[N][sum]?1:0);
    }
}
