class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int currsum = 0;
        for(int i = 0; i<k; i++) {
            currsum+=nums[i];
        }
        int maxsum = currsum;
        for(int i = k; i < n; i++) {
             currsum += nums[i] - nums[i-k];
             maxsum = Math.max(maxsum , currsum);
        }
        return (double) maxsum/k;
    }
}