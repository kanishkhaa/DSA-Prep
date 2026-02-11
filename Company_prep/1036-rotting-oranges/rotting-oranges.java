class Pair {
    int row;
    int col;
    int time;

    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();
        int[][] vis = new int[n][m];
        int fresh = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = 2;
                } 
                else {
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1)
                  fresh++;
            }
        }

        int time = 0;
        int rotten = 0;

        int[] drow = {-1,0,1,0}; //(row-1,col = top , row, col+1 = right, row+1,col = bottom, row,col-1 = left)
        int[] dcol = {0,1,0,-1};
        while(!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.row;
            int col = p.col;
            int t = p.time;
            time = Math.max(time, t);
            for(int i = 0; i < 4; i++) {
                int nrow = r + drow[i];
                int ncol = col + dcol[i];
                if(nrow >= 0 && nrow < n &&
                   ncol >= 0 && ncol < m && // to check within limit
                   grid[nrow][ncol] == 1 && // to check whether they are fresh
                   vis[nrow][ncol] == 0) { // to check whether they are unvisited
                    q.add(new Pair(nrow, ncol, t + 1)); // add the pair and increase time
                    vis[nrow][ncol] = 2; // mark them rotten
                    rotten++;
                }
            }
        }
        if(rotten != fresh) // to check whether all oranges are rotten if not return -1
            return -1;
        return time;
    }
}
