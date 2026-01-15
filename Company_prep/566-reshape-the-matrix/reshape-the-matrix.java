class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(n*m != r*c) {
            return mat;
        }
        int[][] res = new int[r][c];
        int index = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                int newrow = index/c;
                int newcol = index%c;
                res[newrow][newcol] = mat[i][j];
                index+=1;
            }
        }
        return res;
    }
}
        