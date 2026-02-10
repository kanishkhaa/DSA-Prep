class Solution {
    public int minPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j) {
            sum = Math.max(sum, nums[i] + nums[j]);
            i++;
            j--;
        }
        return sum;
    }
}