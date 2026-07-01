class Solution {
    public String convert(String s, int rows) {
        if(rows == 1 || s.length() <= rows) {
            return s;
        }
        StringBuilder[] res = new StringBuilder[rows];
        int r = 0;
        for(int i=0;i<rows;i++) {
            res[i] = new StringBuilder();
        }
        boolean down = true;
        for(char ch : s.toCharArray()) {
            res[r].append(ch);
            if(r == 0) {
                down = true;
            } else if(r == rows-1) {
                down = false;
            }
            if(down) {
                r++;
            } else {
                r--;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder sb : res) {
            ans.append(sb);
        }
        return ans.toString();
    }
}