class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            res.put(nums[i], res.getOrDefault(nums[i],0)+1);
        }
        for(int n : res.values()){
            if (n>=2) return true;
        }
        return false;
    }
}