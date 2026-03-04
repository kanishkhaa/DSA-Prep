class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int min = nums.length/3;
        for(int n : nums) {
            map.put(n,map.getOrDefault(n,0)+1);
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