class Solution {
    public int firstStableIndex(int[] nums, int a) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            int maxi = nums[0];
           for(int j=0;j<=i;j++) {
                maxi = Math.max(maxi,nums[j]);
           }
           int mini = nums[i];
           for(int k=i;k<n;k++) {
                mini = Math.min(mini,nums[k]);
           }
           if(maxi - mini <= a) {
            return i;
           }
        }
        return -1;
    }
}