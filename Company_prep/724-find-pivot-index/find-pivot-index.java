class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++) {
            total+=nums[i];
        }
        int lefttotal = 0;
        for(int i=0;i<nums.length;i++) {
            int righttotal = total-lefttotal-nums[i];
            if(righttotal == lefttotal) {
                return i;
            }
            lefttotal+=nums[i];
        }
        return -1;
    }
}