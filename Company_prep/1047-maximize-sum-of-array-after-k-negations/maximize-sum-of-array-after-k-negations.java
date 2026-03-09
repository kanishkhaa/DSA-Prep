class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        for(int i=0;i<k;i++) {
            int min = 0;
            for(int j=1;j<nums.length;j++) {
                if(nums[j] < nums[min]) {
                   min = j;
                }
            }
            nums[min] = -nums[min];
        }
        int sum = 0;
        for(int num : nums) {
            sum+=num;
        }
        return sum;
    }
}