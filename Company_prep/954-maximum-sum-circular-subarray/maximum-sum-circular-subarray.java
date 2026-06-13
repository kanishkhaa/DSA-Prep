class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxsum = nums[0];
        int minsum = nums[0];
        int currmax = 0;
        int currmin = 0;
        int total = 0;
        for(int n : nums) {
            currmax = Math.max(n, currmax+n);
            maxsum = Math.max(currmax, maxsum);
            currmin = Math.min(n, currmin+n);
            minsum = Math.min(currmin, minsum);
            total+=n;
        }
        if(maxsum < 0) return maxsum;
        return Math.max(maxsum, total-minsum); 
    }
}