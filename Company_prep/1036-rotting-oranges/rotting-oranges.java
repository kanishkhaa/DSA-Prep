class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(grid[i][j] == 2) {
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if(fresh == 0) return 0;
        int minutes = 0;
        int[][] dir = {{1,0} , {-1,0}, {0,1},{0,-1}};
        while(!queue.isEmpty()) {
            int size = queue.size();
            boolean infected = false;
            for(int i=0;i<size;i++) {
                int[] curr = queue.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[] d : dir) {
                    int nr = r+d[0];
                    int nc = c+d[1];
                    if(nr>=0 && nc>=0 && nr<rows && nc< cols && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        fresh--;
                        queue.add(new int[]{nr,nc});
                        infected = true;
                    }
                }
            }
            if(infected) minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}