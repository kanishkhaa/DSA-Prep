class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int num : nums) {
            res.put(num, res.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : res.entrySet()) {
            if(entry.getValue()==1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}