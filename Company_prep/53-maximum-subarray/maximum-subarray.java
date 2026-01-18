class Solution {
    public int maxSubArray(int[] nums) 
    {
    int currsum=0,maxsum=nums[0];
    int n=nums.length;
    for(int i=0;i<n;i++)
    {
        currsum=currsum+nums[i];
        if(maxsum<currsum) maxsum=currsum;
        if(currsum<0) currsum=0;
    }
    return maxsum;
    }
}