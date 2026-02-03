class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
      HashMap<Integer,Integer> s = new HashMap<>();
      int[] res = new int[k];
      for(int num:nums)
      {
         s.put(num, s.getOrDefault(num,0)+1);
      }
      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> s.get(a) - s.get(b));
      for(int key : s.keySet()) {
        pq.add(key);
        if(pq.size() > k) {
            pq.poll();
        }
      }
      for(int i=0;i<k;i++) {
        res[i] = pq.poll();
      }
      return res;
    }
}