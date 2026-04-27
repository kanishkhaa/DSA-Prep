class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int leftpro = 1;
        for(int i=0;i<nums.length;i++) {
            res[i] = leftpro;
            leftpro = leftpro * nums[i];
        }
        int rightpro = 1;
        for(int i = nums.length-1;i>=0;i--) {
            res[i] =  res[i] * rightpro;
            rightpro = rightpro * nums[i]; 
        }
        return res;
    }
}