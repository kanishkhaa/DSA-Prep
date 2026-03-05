class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        boolean[] vis = new boolean[n];
        int maxlen = -1;
        for(int i=0;i<n;i++) {
            if(vis[i]) continue;
            Map<Integer,Integer> map = new HashMap<>();
            int curr = i;
            int step = 0;
            while(curr!=-1 && !vis[curr]) {
                vis[curr] = true;
                map.put(curr, step++);
                curr = edges[curr];
                if(curr!=-1 && map.containsKey(curr)) {
                    int len = step - map.get(curr); 
                    maxlen = Math.max(maxlen,len);
                    break;
                }
            }
        }
        return maxlen;
    }
}