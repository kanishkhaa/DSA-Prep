class Solution {
    public int minimumDifference(int[] nums, int k) {
        int mindiff = Integer.MAX_VALUE;
        int currdiff = 0;
        if(k==1) return 0;
        Arrays.sort(nums);
        for(int i = 0; i<=nums.length-k;i++) {
           currdiff = nums[i+k-1] - nums[i];
           mindiff =  Math.min(mindiff, currdiff);
        }
        return mindiff;
    }
}