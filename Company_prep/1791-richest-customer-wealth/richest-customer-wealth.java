class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int cols = accounts[0].length;
        int maxSum = 0;
        for(int i=0;i<rows;i++)  {
            int currSum = 0;
            for(int j=0;j<cols;j++)  {
                currSum += accounts[i][j];
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}