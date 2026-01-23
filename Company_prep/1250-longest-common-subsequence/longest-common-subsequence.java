class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int n1 = t1.length();
        int n2 = t2.length();
        int[][] dp = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(0,0,t1,t2,n1,n2,dp);
    }
    int helper(int i, int j, String t1, String t2, int n1, int n2,int[][]dp) {
        if(i>=n1 || j>=n2) return 0;
        if(t1.charAt(i)==t2.charAt(j)) return 1 + helper(i+1,j+1,t1,t2,n1,n2,dp);
        if (dp[i][j] != -1) return dp[i][j];
        return dp[i][j]=Math.max(helper(i+1,j,t1,t2,n1,n2,dp) , helper(i,j+1,t1,t2,n1,n2,dp));

    }
}