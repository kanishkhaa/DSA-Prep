class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if(k<0 || k>n) return -1;
        int sum = 0, maxsum = 0;
        for(int i=0;i<k;i++) {
            sum+=nums[i];
        }
        maxsum = sum;
        for(int i = k;i<n;i++) {
            sum+=nums[i] - nums[i-k];
            maxsum = Math.max(maxsum,sum);
        }
        return (double) maxsum/k;
    }
}