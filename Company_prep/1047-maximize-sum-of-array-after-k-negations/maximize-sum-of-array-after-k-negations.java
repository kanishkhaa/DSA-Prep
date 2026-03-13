class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        for(int i=0;i<k;i++) {
            int minIndex = 0;
            for(int j=0;j<nums.length;j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            nums[minIndex] = -nums[minIndex];
        }
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
        }
        return sum;
    }
}