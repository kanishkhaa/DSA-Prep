class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int pos = n-1;
        while(left<=right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare > rightSquare) {
                res[pos--] = leftSquare;
                left++;
            }
            else {
                res[pos--] = rightSquare;
                right--;
            }
        }
        return res;
    }
}