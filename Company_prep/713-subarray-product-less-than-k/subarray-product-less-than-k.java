class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int pro = 1;
        int left = 0;
        int count = 0;
        for(int right=0;right<n;right++) {
            pro*=nums[right];
            while(pro >=k && left<=right) {
                pro/=nums[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }
}