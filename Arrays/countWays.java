

/*
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Input:
N=3,  K=2 
Output: 6

Input:
N=2,  K=4
Output: 16


*/


class Solution
{
    long countWays(int n,int k)
    {
        //code here.i
        long res = 0;
        if(n == 0) return 0;
        if(n == 1 ) return k;
        else{
            res = k;
            long differentColorCombi = k;
            for(int i=2; i<=n; i++){
                long sameColorCombi = differentColorCombi;
                differentColorCombi = res*(k-1);
                differentColorCombi %= 1000000007;
                res = (sameColorCombi + differentColorCombi)%1000000007;
            }
        }
        
        return res;
    }
}
