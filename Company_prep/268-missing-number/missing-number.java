class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s = 0;
        for(int i=0;i<=n;i++) {
            s^=i;
        }
        for(int num : nums) {
           s^=num;
        }
        return s;
    }
}