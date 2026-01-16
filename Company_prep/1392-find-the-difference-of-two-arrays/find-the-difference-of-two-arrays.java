class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int n : nums1) {
            n1.add(n);
        }
        for(int n : nums2) {
            n2.add(n);
        }
        for(int x : n1) {
            if(!n2.contains(x)) {
                diff1.add(x);
            }
        }
         for(int x : n2) {
            if(!n1.contains(x)) {
                diff2.add(x);
            }
        }
        res.add(diff1);
        res.add(diff2);
        return res;
    }
}