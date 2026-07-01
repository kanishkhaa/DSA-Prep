class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        if(n*m != r*c) {
            return mat;
        }
        int index = 0;
        int[][] res = new int[r][c];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                res[index/c][index%c] = mat[i][j];
                index++;
            }
        }
        return res;
    }
}