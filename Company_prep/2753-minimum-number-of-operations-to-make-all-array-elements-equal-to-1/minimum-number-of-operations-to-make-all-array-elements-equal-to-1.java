class Solution {
    public int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public int minOperations(int[] nums) {
        int ones = 0;
        for(int n : nums) {
            if(n==1) ones++;
        }
        if(ones > 0) return nums.length-ones;
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            int curr = nums[i];
            for(int j=i;j<nums.length;j++) {
                curr = gcd(curr, nums[j]);
                if(curr == 1) {
                   minLen = Math.min(minLen,j-i+1);
                   break;
                }
            }
        }
        if(minLen == Integer.MAX_VALUE) return -1;
        return (minLen-1) + (nums.length-1);
    }
}