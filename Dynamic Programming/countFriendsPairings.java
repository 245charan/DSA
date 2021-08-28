/*
TC -> O(n) SC -> O(n)

Example 1:

Input:N = 3
Output: 4
Explanation:
{1}, {2}, {3} : All single
{1}, {2,3} : 2 and 3 paired but 1 is single.
{1,2}, {3} : 1 and 2 are paired but 3 is single.
{1,3}, {2} : 1 and 3 are paired but 2 is single.
Note that {1,2} and {2,1} are considered same.
Example 2: 

Input: N = 2
Output: 2
Explanation:
{1} , {2} : All single.
{1,2} : 1 and 2 are paired

*/


class Solution
{
    public long countFriendsPairings(int n) 
    { 
       //code here
       long dp[] = new long[n+1];
       for(int i=0;i<=n;i++){
           if(i<=2){
               dp[i] = (long)i;
           }else{
               dp[i] = (dp[i-1]+ (i-1)*dp[i-2])%1000000007;;
           }
       }
       return dp[n];
    }
}    
