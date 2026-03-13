class Solution {
    public void helper(int[] nums, int index, List<Integer> curr, List<List<Integer>> res) {
        if(index == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        helper(nums,index+1,curr, res);
        curr.add(nums[index]);
        helper(nums, index+1, curr, res);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,0,new ArrayList<>(),res);
        return res;
    }
}