class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int count = 0;
        int leftmax = 0;
        int rightmax = 0;
        while(left<right) {
           if(height[left] < height[right]) {
           leftmax = Math.max(leftmax,height[left]);
           count+=leftmax - height[left];
           left++;
        } else if(height[left] >= height[right]) {
            rightmax = Math.max(rightmax,height[right]);
            count+=rightmax - height[right];
            right--;
        }
      }
      return count;
    }
}