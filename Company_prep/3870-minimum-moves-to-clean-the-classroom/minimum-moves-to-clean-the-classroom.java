import java.util.*;
class Solution {
    static class State {
        int r, c;
        int mask;
        int energy;
        State(int r, int c, int mask, int energy) {
            this.r = r;
            this.c = c;
            this.mask = mask;
            this.energy = energy;
        }
    }
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        int startR = 0;
        int startC = 0;
        int litterCount = 0;
        int[][] litterIndex = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(litterIndex[i], -1);
            for (int j = 0; j < n; j++) {
                char ch = classroom[i].charAt(j);
                if (ch == 'S') {
                    startR = i;
                    startC = j;
                }
                if (ch == 'L') {
                    litterIndex[i][j] = litterCount++;
                }
            }
        }

        // All litter collected initially
        if (litterCount == 0) {
            return 0;
        }

        int allCollected = (1 << litterCount) - 1;

        /*
         * visited[row][col][mask][energy]
         */
        boolean[][][][] visited =
            new boolean[m][n][1 << litterCount][energy + 1];

        Queue<State> queue = new LinkedList<>();

        int startMask = 0;

        queue.offer(new State(
            startR,
            startC,
            startMask,
            energy
        ));

        visited[startR][startC][startMask][energy] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Process one BFS level
            for (int k = 0; k < size; k++) {

                State cur = queue.poll();

                // Have we collected everything?
                if (cur.mask == allCollected) {
                    return moves;
                }

                for (int d = 0; d < 4; d++) {

                    int nr = cur.r + dr[d];
                    int nc = cur.c + dc[d];

                    // Outside grid
                    if (nr < 0 || nr >= m ||
                        nc < 0 || nc >= n) {
                        continue;
                    }

                    // Cannot move through obstacle
                    if (classroom[nr].charAt(nc) == 'X') {
                        continue;
                    }

                    // Need one energy to make this move
                    if (cur.energy == 0) {
                        continue;
                    }

                    int newEnergy = cur.energy - 1;
                    int newMask = cur.mask;

                    char cell = classroom[nr].charAt(nc);

                    // Collect litter
                    if (cell == 'L') {
                        int index = litterIndex[nr][nc];
                        newMask |= (1 << index);
                    }

                    // Reset energy
                    if (cell == 'R') {
                        newEnergy = energy;
                    }

                    // Avoid repeated states
                    if (!visited[nr][nc][newMask][newEnergy]) {

                        visited[nr][nc][newMask][newEnergy] = true;

                        queue.offer(
                            new State(
                                nr,
                                nc,
                                newMask,
                                newEnergy
                            )
                        );
                    }
                }
            }

            moves++;
        }

        return -1;
    }
}