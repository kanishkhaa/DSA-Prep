class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxlen = 1;
        int curr = 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i] > nums[i-1]) {
                curr++;
            } else {
                curr = 1;
            }
            maxlen = Math.max(maxlen, curr);
        }
        return maxlen;
    }
}