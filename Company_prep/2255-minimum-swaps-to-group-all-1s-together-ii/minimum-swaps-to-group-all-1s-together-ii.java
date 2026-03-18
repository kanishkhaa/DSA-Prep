class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int total = 0;
        for(int num : nums) {
            total+=num;
        }
        if(total == 0 || total == n) return 0;
        int curr = 0;
        int maxones = 0;
        int left = 0;
        for(int right = 0;right<n+total;right++) {
            curr+=nums[right%n];
            if(right-left+1 > total) {
                curr-=nums[left%n];
                left++;
            }
            maxones = Math.max(maxones,curr);
        }
        return total - maxones;
    }
}