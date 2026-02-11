class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        String min1 = String.valueOf(Arrays.stream(nums1).min().getAsInt());
        String min2 = String.valueOf(Arrays.stream(nums2).min().getAsInt());
        int m1 = Integer.parseInt(min1);
        int m2 = Integer.parseInt(min2);
        String min3 = "";
        if(m1>m2) {
           min3 = min2+min1;
        } else {
            min3 = min1+min2;
        }
        int min4 = Integer.parseInt(min3);
        for(int i=0;i<nums1.length;i++) {
            for(int j=0;j<nums2.length;j++) {
                if(nums1[i] == nums2[j]) {
                  min = Math.min(min,nums1[i]);
                }
            }
        }
        return Math.min(min4, min);
    }
}