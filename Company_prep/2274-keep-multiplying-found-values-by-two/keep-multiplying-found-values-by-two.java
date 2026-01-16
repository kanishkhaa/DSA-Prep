class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> res = new HashSet<>();
        for(int num : nums) res.add(num);
        while(res.contains(original)) {
            original = 2*original;
        }
        return original;
    }
}