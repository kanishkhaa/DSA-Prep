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
            if(dfs(i,graph, vis)) {
                return false;
            }
        }
        return true; 
    }
    public boolean dfs(int course,List<List<Integer>> graph , int[] vis) {
        if(vis[course] == 1) return true;
        if(vis[course] == 2) return false;
        vis[course] = 1;
        for(int node : graph.get(course)) {
            if(dfs(node,graph, vis)) return true;
        }
        vis[course] = 2;
        return false;
    }
}