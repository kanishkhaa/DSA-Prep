class Solution {
    List<Integer>[] graph;
    boolean[] vis;
    int nodes;
    int e;
    public int countCompleteComponents(int n, int[][] edges) {
        graph = new ArrayList[n];
        for(int i=0;i<n;i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        vis =  new boolean[n];
        int ans = 0;
        for(int i=0;i<n;i++) {
            if(!vis[i]) {
                nodes = 0;
                e = 0;
                dfs(i);
                e/=2;
                if(e == nodes * (nodes-1)/2){
                    ans++;
                }
            }
        }
        return ans;
    }
    private void dfs(int node) {
        vis[node] = true;
        nodes++;
        e+=graph[node].size();
        for(int nei : graph[node]) {
            if(!vis[nei]) {
                dfs(nei);
            }
        }
    }
}