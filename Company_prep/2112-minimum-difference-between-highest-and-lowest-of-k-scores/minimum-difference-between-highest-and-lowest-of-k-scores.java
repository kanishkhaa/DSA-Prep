class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
        int left = 0;
        int right = k - 1;
        int diff = Integer.MAX_VALUE;
        while(right < nums.length){
            diff = Math.min(diff, nums[right] - nums[left]);
            left++;
            right++;
        }
        return diff;
    }
}