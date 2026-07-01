class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]);
        }
        int[] vis = new int[numCourses];
        for(int i=0;i<numCourses;i++) {
            if(dfs(i,graph,vis)) return false;
        }
        return true;
    }
    public boolean dfs(int node, List<List<Integer>> graph,int[] vis) {
        if(vis[node] == 1) return true;
        if(vis[node] == 2) return false;
        vis[node] = 1;
        for(int nod : graph.get(node)) {
            if(dfs(nod,graph, vis)) return true;
        }
        vis[node] = 2;
        return false;
    }
}