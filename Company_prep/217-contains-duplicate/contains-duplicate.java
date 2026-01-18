class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int n: nums){
            if(!res.add(n)) return true;
        }
        return false;
    }
}