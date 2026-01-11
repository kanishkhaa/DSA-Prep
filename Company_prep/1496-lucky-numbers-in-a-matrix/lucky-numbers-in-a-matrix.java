class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int rowMinMax = Integer.MIN_VALUE;
        for(int i=0;i<rows;i++) {
            int rowMin = Integer.MAX_VALUE;
            for(int j=0;j<cols;j++) {
                rowMin = Math.min(rowMin, matrix[i][j]);
            }
            rowMinMax = Math.max(rowMin, rowMinMax);
        }
        int colMaxMin = Integer.MAX_VALUE;
        for(int i=0;i<cols;i++) {
            int colMax = Integer.MIN_VALUE;
            for(int j=0;j<rows;j++) {
                colMax = Math.max(colMax, matrix[j][i]);
            }
            colMaxMin = Math.min(colMax, colMaxMin);
        }
        if(rowMinMax == colMaxMin) {
            return new ArrayList<>(Arrays.asList(rowMinMax));
        }
        return new ArrayList<>();


    }
}