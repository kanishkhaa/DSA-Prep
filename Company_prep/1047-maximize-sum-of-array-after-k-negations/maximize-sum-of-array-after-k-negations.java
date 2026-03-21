class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
      int n = nums.length;
      for(int i=0;i<k;i++) {
         int minindex = 0;
         for(int j=0;j<n;j++) {
            if(nums[j] < nums[minindex]) {
                minindex = j;
            }
         }
         nums[minindex] = -nums[minindex];
      }
      int sum = 0;
      for(int i=0;i<n;i++) {
        sum+=nums[i];
      }
      return sum;
    }
}