class Solution {
    public void reverse(int[] row) {
        int left = 0;
        int right = row.length-1;
        while(left<right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
    public void invert(int[] row) {
        for(int i=0;i<row.length;i++) {
            row[i] = row[i]^1;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++) {
            reverse(image[i]);
            invert(image[i]);
        }
        return image;
    }
}