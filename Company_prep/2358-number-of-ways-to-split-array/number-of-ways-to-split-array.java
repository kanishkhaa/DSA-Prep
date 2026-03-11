class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for(int num : nums) {
            sum+=num;
        }
        long leftsum = 0;
        int count = 0;
        for(int i=0;i<n-1;i++) {
            leftsum +=nums[i];
            long rightsum = sum - leftsum;
            if(leftsum>=rightsum) {
                count++;
            }
        }
        return count;
    }
}