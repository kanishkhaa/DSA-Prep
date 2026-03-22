class Solution {
    public int maxProduct(int[] nums) {
        int maxpro1 = Integer.MIN_VALUE;
        int maxpro2 = Integer.MIN_VALUE;
        int currpro = 1;
        for(int n: nums) {
            currpro*=n;
            maxpro1 = Math.max(maxpro1,currpro);
            if(currpro == 0) currpro=1;
        }
        currpro=1;
        for(int i=nums.length-1;i>=0;i--) {
            currpro*=nums[i];
            maxpro2 = Math.max(maxpro2,currpro);
            if(currpro==0) currpro = 1;
        }
        return Math.max(maxpro1, maxpro2);
    }
}