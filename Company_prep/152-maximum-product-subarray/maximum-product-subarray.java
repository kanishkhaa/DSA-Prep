class Solution {
    public int maxProduct(int[] nums) {
        int currpro = 1;
        int maxpro1 = Integer.MIN_VALUE;
        int maxpro2 = Integer.MIN_VALUE;
        for(int n : nums) {
            currpro*=n;
            maxpro1 = Math.max(currpro, maxpro1);
            if(currpro==0) currpro = 1;
        }
        currpro = 1;
        for(int i = nums.length-1;i>=0;i--) {
            currpro*=nums[i];
            maxpro2 = Math.max(currpro, maxpro2);
            if(currpro == 0) currpro = 1;
        }
        return Math.max(maxpro1, maxpro2);
    }
}