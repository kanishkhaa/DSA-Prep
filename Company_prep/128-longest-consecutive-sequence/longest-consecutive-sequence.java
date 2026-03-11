class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = 0;
        for(int n : nums) {
            set.add(n);
        }
        for(int n : set) {
           if(!set.contains(n-1)) {
            int curr = n;
            int currlen = 1;
            while(set.contains(curr+1)) {
                curr+=1;
                currlen+=1;
            }
            len = Math.max(len, currlen);
           }
        }
        return len;
    }
}