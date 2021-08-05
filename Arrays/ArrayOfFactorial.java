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
