class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int index = 0;
        for(int n : nums){
            int count = map.getOrDefault(n,0);
            if(count<2) {
              nums[index++] = n;
              map.put(n,count+1);
            }
        }
        return index;
    }
}