class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftPro = 1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            res[i] = leftPro;
            leftPro = leftPro * nums[i]; 
        }
        int rightPro = 1;
        for(int i=nums.length-1;i>=0;i--) {
            res[i] = res[i] * rightPro;
            rightPro = rightPro * nums[i];
        }
        return res;
    }
}