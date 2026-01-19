class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int j=1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==j) {
                j++;
            }
            if(nums[i] > j) {
                return j;
            }
        }
        return j;
    }
}