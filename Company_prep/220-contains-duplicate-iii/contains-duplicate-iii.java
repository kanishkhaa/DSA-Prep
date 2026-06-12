class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int currdiff = 0;
        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i<nums.length;i++) {
            long curr = nums[i];
            Long  a = set.ceiling(curr - valueDiff);
            if(a != null && a <= curr + valueDiff) {
                return true;
            }
            set.add(curr);
            if(set.size() > indexDiff) {
                set.remove((long)nums[i-indexDiff]);
            }
        }
        return false;
    }
}