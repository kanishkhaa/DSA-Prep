class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallodd = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++) {
            if(nums1[i] % 2 == 1) {
                smallodd = Math.min(nums1[i],smallodd);
            }
        }
        if(smallodd == Integer.MAX_VALUE) return true;
        for(int num :  nums1) {
            if(num % 2 == 0 && num <=  smallodd) {
                return false;
            }
        }
        return true;
    }
}