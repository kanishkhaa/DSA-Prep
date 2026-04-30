class RecentCounter {
     Queue<Integer> p ;
    public RecentCounter()
     {
       p = new LinkedList<>();
    }
    public int ping(int t) 
    {
        p.add(t);
        while(!p.isEmpty() && p.peek()< t-3000)
        {
            p.poll();
        }
        return p.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */