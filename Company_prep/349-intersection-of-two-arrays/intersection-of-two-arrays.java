class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> s = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left = 0;
        int right = 0;
        while(left<nums1.length && right<nums2.length)
        {
            if(nums1[left] < nums2[right])
            {
                left++;
            }
            else if(nums1[left]> nums2[right])
            {
                right++;
            }
            else
            {
                s.add(nums1[left]);
                left++;
                right++;
            }
        }
        int[] res = new int[s.size()];
        int i=0;
        for(Integer num : s)
        {
            res[i++] = num;
        }
       return res;
    }
}