class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1];
        Map<Integer,Integer> hm = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int ele : nums2)
        {
            while(!s.isEmpty() && s.peek()< ele)
            {
                hm.put(s.pop(),ele);
            }
            s.push(ele);
        }
        for(int i=0;i<n1;i++)
        {
            res[i] = hm.containsKey(nums1[i])? hm.get(nums1[i]) : -1;
        }
       return res;

    }
}