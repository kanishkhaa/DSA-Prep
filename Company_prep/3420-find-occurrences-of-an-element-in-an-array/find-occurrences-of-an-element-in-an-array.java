class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == x) {
                res.add(i);
            }
        }
        int[] ans = new int[queries.length];
        for(int i=0;i<queries.length;i++) {
            int k = queries[i];
            if(k-1<res.size()) {
               ans[i] = res.get(k-1);
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}