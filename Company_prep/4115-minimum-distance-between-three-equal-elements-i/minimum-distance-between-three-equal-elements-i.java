class Solution {
    public int distance(int i,int j,int k) {
        return Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
    }
    public int minimumDistance(int[] nums) {
      Map<Integer, List<Integer>> map = new HashMap<>();
      for(int i=0;i<nums.length;i++) {
        int val = nums[i];
        if(!map.containsKey(val)) {
            map.put(val,new ArrayList<>());
        }
        map.get(val).add(i);
      } 
        int min = Integer.MAX_VALUE;
        for(List<Integer> list : map.values()) {
            if(list.size() < 3) {
                continue;
            }
            for(int i=0;i+2<list.size();i++) {
                int a =  list.get(i);
                int b = list.get(i+1);
                int c = list.get(i+2);
                int dist = distance(a,b,c);
                min = Math.min(min, dist);
            }   
        }
        
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}