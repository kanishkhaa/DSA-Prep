class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] res = new int[n*m];
        int index = 0;
        for(int d = 0; d<n+m-1; d++) {
            if(d%2==0) {
                int r = Math.min(d,n-1);
                int c = d-r;
                while(r>=0 && c<m) {
                    res[index++] = mat[r][c];
                    r--;
                    c++;
                }
            } else {
                int c = Math.min(d,m-1);
                int r = d-c;
                while(c>=0 && r<n) {
                    res[index++] = mat[r][c];
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}