class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int len = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        for(int a : set) {
             if(!set.contains(a-1)){
                int curr = a;
                int currLen = 1;
                while(set.contains(curr+1)) {
                    curr+=1;
                    currLen+=1;
                }
              len = Math.max(currLen, len);
             }
            }
          return len;
        }
    }