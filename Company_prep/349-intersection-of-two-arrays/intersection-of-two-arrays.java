class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(left < nums1.length && right < nums2.length) {
            if(nums1[left] <  nums2[right]) {
                left ++;
            } else if(nums1[left] > nums2[right]) {
                right++;
            } else {
                set.add(nums1[left]);
                left++;
                right++;
            }
        }
        int[] res = new int[set.size()];
        int i = 0;
        for(int n : set) {
            res[i++] = n;
        }
        return res;
    }
}