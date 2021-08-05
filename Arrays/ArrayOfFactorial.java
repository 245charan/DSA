class Solution {
    public long[] factorial(long a[], int n) {
        int i, MAX = 100_000;
        long fac[] = new long[MAX + 1], mod = 1000_000_007;
        fac[0] = 1;
        for (i = 1; i <= MAX; i++) {
            fac[i] = (fac[i - 1] % mod * (long)i) % mod;
        }
        long[] ans = new long[n];
        
        for (i = 0; i < n; i++) {
            ans[i] = fac[(int)a[i]];
        }
        return ans;
    }
}

/**


Factorial of a non-negative integer, is the multiplication of all integers smaller than or equal to n. 
For example factorial of 6 is 6*5*4*3*2*1 which is 720.

factorial of i = factorial of i-1 * i

*/
