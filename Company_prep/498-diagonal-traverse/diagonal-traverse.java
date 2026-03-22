class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int index = 0;
        int[] res = new int[row*col];
        for(int d=0;d<row+col-1;d++) {
            if(d%2==0) {
                int r = Math.min(d,row-1);
                int c = d-r;
                while(r>=0 && c< col) {
                    res[index++] = mat[r][c];
                    r--;
                    c++;
                }
            } else {
                int c = Math.min(d,col-1);
                int r = d-c;
                while(c>=0 && r<row) {
                    res[index++] = mat[r][c];
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}