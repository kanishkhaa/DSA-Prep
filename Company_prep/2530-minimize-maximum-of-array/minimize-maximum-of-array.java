class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            int avg = (int)Math.ceil((double) sum / (i+1));
            ans = Math.max(ans,avg);
        }
       return ans;
    }
}