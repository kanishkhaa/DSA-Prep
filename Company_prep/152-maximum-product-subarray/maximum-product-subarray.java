class Solution {
    public int maxProduct(int[] nums) {
        int pro1 = Integer.MIN_VALUE;
        int pro2 = Integer.MIN_VALUE;
        int curr = 1;
        for(int i = 0 ;i<nums.length;i++) {
           curr*=nums[i];
           pro1 = Math.max(pro1, curr);
           if(curr == 0) curr = 1;
        }
        curr = 1;
        for(int i = nums.length-1;i>=0;i--) {
            curr*=nums[i];
            pro2 = Math.max(pro2,curr);
            if(curr == 0) curr = 1;
        } 
        return Math.max(pro1, pro2);
    }
}