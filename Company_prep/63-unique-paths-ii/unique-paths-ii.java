class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        int m = og.length;
        int n = og[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(0, 0, og, m, n, dp);
    }
    int helper(int i, int j, int[][] og, int m, int n, int[][] dp) {
        if (i >= m || j >= n) return 0;
        if (og[i][j] == 1) return 0;
        if (i == m - 1 && j == n - 1) return 1;
        if (dp[i][j] != -1) return dp[i][j];
        dp[i][j] = helper(i + 1, j, og, m, n, dp) + helper(i, j + 1, og, m, n, dp);
        return dp[i][j];
    }
}
