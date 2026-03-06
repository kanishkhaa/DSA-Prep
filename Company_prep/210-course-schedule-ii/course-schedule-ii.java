class Solution {
    public int[] findOrder(int num, int[][] pre) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<num;i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] p : pre) {
            graph.get(p[1]).add(p[0]);
        }
        int[] vis = new int[num];
        List<Integer> order = new ArrayList<>();
        for(int i=0;i<num;i++) {
            if(dfs(i, graph, vis,order)) return new int[0];
        }
        int[] res = new int[num];
        for(int i = 0;i<num;i++) {
            res[i] = order.get(num-1-i);
        }
        return res;    
    }
    public boolean dfs(int course, List<List<Integer>> graph, int[] vis, List<Integer> order) {
        if(vis[course] == 1) return true;
        if(vis[course] == 2) return false;
        vis[course] = 1;
        for(int node : graph.get(course)) {
          if(dfs(node,graph,vis,order)) return true;
        }
        vis[course] = 2;
        order.add(course);
        return false;
    }
}