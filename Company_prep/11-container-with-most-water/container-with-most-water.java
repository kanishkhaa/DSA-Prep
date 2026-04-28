class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxarea = 0;
        while(left<right) {
            int h =  Math.min(height[right] , height[left]);
            int w = right-left;
            int a = h*w;
            maxarea = Math.max(maxarea,a);
            if(height[left] < height[right]) {
                left++;
            } else if(height[right] <= height[left]) {
                right--;
            }
        }
        return maxarea;
    }
}