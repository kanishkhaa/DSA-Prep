class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int row = box.length;
        int col = box[0].length;
        for(int i=0;i<row;i++) {
            int empty = col-1;
            for(int j=col-1;j>=0;j--) {
                if(box[i][j] == '*') {
                    empty = j-1;
                } else if(box[i][j] == '#') {
                    box[i][j] = '.';
                    box[i][empty] = '#';
                    empty--;
                }
            }
        }
        char[][] res = new char[col][row];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                res[j][row-1-i] = box[i][j];
            }
        }
        return res;
    }
}