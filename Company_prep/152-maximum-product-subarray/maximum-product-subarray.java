class Solution {
    public int maxProduct(int[] nums) {
        int currPro = 1;
        int maxPro1 = -11;
        int maxPro2 = -11;
        for(int num : nums) {
            currPro = currPro*num;
            maxPro1 = Math.max(currPro,maxPro1);
            if(currPro==0) currPro=1;
        }
        currPro = 1;
        for(int i=nums.length-1;i>=0;i--) {
            currPro = currPro*nums[i];
            maxPro2 = Math.max(currPro,maxPro2);
            if(currPro==0) currPro=1;
        }
        return Math.max(maxPro1,maxPro2);
    }
}