class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        char col1 = s.charAt(0);
        int row1 = s.charAt(1) -'0';
        char col2 = s.charAt(3);
        int row2 = s.charAt(4) - '0';
        for(char c = col1;c<=col2;c++) {
            for(int r = row1;r<=row2;r++) {
                 res.add(""+c+r);
            }
        }
        return res;
    }
}