class Solution {
    static int dp[][];
    static int min(int x, int y, int z) {
        if (x <= y && x <= z) return x;
        if (y <= x && y <= z)
            return y;
        else
            return z;
    }
    static int fun(String s, String t, int pos1, int pos2) {
        // If first string is empty, the only option is to
        // insert all characters of second string into first
        if (pos1 == 0) return pos2;
        // If second string is empty, the only option is to
        // remove all characters of first string
        if (pos2 == 0) return pos1;
        // If already calculated.

        if (dp[pos1][pos2] != -1) return dp[pos1][pos2];
        // If last characters of two strings are same, nothing
        // much to do. Ignore last characters and get count for
        // remaining strings.
        if (s.charAt(pos1 - 1) == t.charAt(pos2 - 1))
            return dp[pos1][pos2] = fun(s, t, pos1 - 1, pos2 - 1);
        // If last characters are not same, consider all three
        // operations on last character of first string, recursively
        // compute minimum cost for all three operations and take
        // minimum of three values.
        return dp[pos1][pos2] = min(1 + fun(s, t, pos1, pos2 - 1),
                                    1 + fun(s, t, pos1 - 1, pos2),
                                    1 + fun(s, t, pos1 - 1, pos2 - 1));
    }
    public int editDistance(String s, String t) {
        dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i <= s.length(); i++)
            for (int j = 0; j <= t.length(); j++) dp[i][j] = -1;

        int ans = fun(s, t, s.length(), t.length());
        return ans;
    }
}
