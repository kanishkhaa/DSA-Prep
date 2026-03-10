class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[][] board =  new boolean[8][8];
        for(int[] q : queens) {
            board[q[0]][q[1]] = true;
        }
        int[][] directions =  {
            {-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}
        };
        for(int[] d : directions) {
            int x = king[0];
            int y = king[1];
            while(true) {
                x+=d[0];
                y+=d[1];
                if(x<0 || y<0 || x>=8 || y>=8) {
                    break;
                }
                if(board[x][y]) {
                    res.add(Arrays.asList(x,y));
                    break;
                }
            }
        }
        return res;
    }
}