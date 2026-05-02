class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int totalsum = 0;
        int first = 0;
        for(int i=0;i<n;i++) {
            totalsum+=nums[i];
            first+= i * nums[i];
        }
        int maxval = first;
        for(int i=1;i<n;i++) {
            first = first + totalsum - n * nums[n-i];
            maxval = Math.max(maxval, first);
        }
        return maxval;
    }
}