class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        for(int i=0;i<k;i++) {
            int minindex = 0;
            for(int j=0;j<nums.length;j++) {
                if(nums[j] < nums[minindex]) {
                    minindex = j;
                }
            }
            nums[minindex] = -nums[minindex];
        }
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
        }
        return sum;
    }
}