class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum = 0;
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<nums.length;i++) {
            int include = nums[i];
            if(i>1) include+=prev2;
            int exclude = prev;
            int curr = Math.max(include,exclude);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}