class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = nums.length/3;
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > min) {
                res.add(key);
            }
        }
        Collections.sort(res);
        return res;
    }
}