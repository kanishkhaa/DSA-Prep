class Solution {
    public void dfs(int node, int[][]c, int[] vis)  {
         vis[node] = 1;
         for(int i=0;i<c.length;i++){
            if(c[node][i]==1 && vis[i]==0) {
            dfs(i,c,vis);
            }
         }
    }
    public int findCircleNum(int[][] c) {
        int[] vis = new int[c.length];
        int count = 0;
        for(int i=0;i<c.length;i++) {
            if(vis[i]==0) {
                count++;
                dfs(i,c,vis);
            }
        }
        return count;
    }
}