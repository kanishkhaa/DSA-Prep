class Solution {
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        boolean[][] pal = new boolean[n][n];
        int[] dp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            dp[i + 1] = dp[i];
            for (int j = i; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j) &&
                    (i - j <= 1 || pal[j + 1][i - 1])) {
                    pal[j][i] = true;
                    if (i - j + 1 >= k) {
                        dp[i + 1] = Math.max(
                            dp[i + 1],
                            dp[j] + 1
                        );
                    }
                }
            }
        }

        return dp[n];
    }
}