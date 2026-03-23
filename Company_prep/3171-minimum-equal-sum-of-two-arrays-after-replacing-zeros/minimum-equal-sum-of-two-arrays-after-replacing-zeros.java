class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        int z1 = 0;
        int z2 = 0;
        for(int x : nums1) {
            if(x==0) z1++;
            else sum1+=x;
        }
        for(int x : nums2) {
            if(x==0) z2++;
            else sum2+=x;
        }
        long min1 = sum1+z1;
        long min2 = sum2+z2;
        if(min1 == min2) return min1;
        if(min1 < min2) {
            if(z1==0) return -1;
            return min2;
        }
        if(min2<min1) {
            if(z2==0) return -1;
            return min1;
        }
        return -1;
    }
}