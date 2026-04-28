class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int count = 0;
        int maxones = 0;
        for(int right = 0;right<nums.length;right++) {
            if(nums[right] == 0) {
                count++;
            }
            while(count > 1) {
                if(nums[left] == 0) count--;
                left++;
            }
            maxones = Math.max(maxones, right-left);
        }
        return maxones;
    }
}