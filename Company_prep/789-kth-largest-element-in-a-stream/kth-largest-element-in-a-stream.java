class KthLargest {
   int k;
   PriorityQueue<Integer> p = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) 
    {
        this.k = k;
        
        for(int num :nums)
        {
            p.add(num);
        }
        while(p.size()>k)
        {
            p.poll();
        }
    }
    public int add(int val) {
        p.add(val);
        if(p.size()>k)
        {
           p.poll();
        }
        return p.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */