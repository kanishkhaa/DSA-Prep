class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0;i<n;i++) {
            map.put(arr[i] , i);
        }
        int[][] dp = new int[n][n];
        for(int j=0;j<n;j++) {
            for(int k=j+1;k<n;k++) {
                int prev = arr[k] - arr[j];
                Integer i = map.get(prev);
                if(i!= null && i<j) {
                    dp[j][k] = dp[i][j]+1;
                }else {
                    dp[j][k] = 2;
                }
                ans = Math.max(ans, dp[j][k]);
            }
        }
        return ans > 2 ? ans : 0;
    }
}