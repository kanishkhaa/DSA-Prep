class Solution {
    public int len (int n) {
        int temp = n;
        int count = 0;
        while(temp > 0) {
            int d  = temp % 10;
            count++;
            temp/=10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++) {
           if(len(nums[i]) % 2 == 0) {
              res++;
           }
        }
        return res;
    }
}