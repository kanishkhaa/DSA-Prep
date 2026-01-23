class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
         int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return LPS(s, 0, n - 1,dp);
    }

    int LPS(String s, int i, int j,int[][] dp) {
        if (i > j) return 0;
        if (i == j) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        if (s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = 2 + LPS(s, i + 1, j - 1,dp);
        }
        return dp[i][j] = Math.max(LPS(s, i + 1, j,dp), LPS(s, i, j - 1,dp));
    }
}
