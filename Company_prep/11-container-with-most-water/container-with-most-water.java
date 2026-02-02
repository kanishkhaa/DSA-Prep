class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right) {
            int h = Math.min(height[right],height[left]);
            int w = right - left;
            int a = h*w;
            maxArea = Math.max(maxArea,a);
            if(height[left] < height[right]) {
                left++;
            } else if(height[right] <= height[left]) {
                right--;
            }
        }
        return maxArea;
    }
}