class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        Arrays.fill(dist1, -1);
        Arrays.fill(dist2,-1);

        compute(edges,node1,dist1);
        compute(edges, node2,dist2);
        int res = -1;
        int mindis = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if(dist1[i]!=-1 && dist2[i]!=-1) {
                int maxdis = Math.max(dist1[i], dist2[i]);
                if(maxdis < mindis) {
                    mindis = maxdis;
                    res = i;
                }
            }
        }
        return res;
    }
    private void compute(int[]edges, int start, int[] dist) {
        int step = 0;
        int current = start;
        while(current!=-1 && dist[current] == -1) {
            dist[current] = step;
            current = edges[current];
            step++;
        }
    }
}