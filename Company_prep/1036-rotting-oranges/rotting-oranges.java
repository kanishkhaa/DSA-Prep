import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // Step 1: find rotten oranges and count fresh
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){

                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }

                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        // If no fresh oranges
        if(fresh==0)
            return 0;

        int minutes = 0;

        int[][] directions = {
                {1,0}, {-1,0}, {0,1}, {0,-1}
        };

        // BFS
        while(!queue.isEmpty()){

            int size = queue.size();
            boolean infected = false;

            for(int i=0;i<size;i++){

                int[] cell = queue.poll();
                int r = cell[0];
                int c = cell[1];

                for(int[] dir : directions){

                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if(nr>=0 && nc>=0 && nr<rows && nc<cols && grid[nr][nc]==1){

                        grid[nr][nc] = 2;
                        fresh--;

                        queue.offer(new int[]{nr,nc});
                        infected = true;
                    }
                }
            }

            if(infected)
                minutes++;
        }

        return fresh==0 ? minutes : -1;
    }
}