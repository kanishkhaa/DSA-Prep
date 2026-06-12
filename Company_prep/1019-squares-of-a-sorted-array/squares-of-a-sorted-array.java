class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int k = n-1;
        int[] res = new int[n];
        while(left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];
            if(leftsq > rightsq) {
                res[k--] = leftsq;
                left++;
            } else {
                res[k--] = rightsq;
                right--;
            }
        }
       return res;
    }
}