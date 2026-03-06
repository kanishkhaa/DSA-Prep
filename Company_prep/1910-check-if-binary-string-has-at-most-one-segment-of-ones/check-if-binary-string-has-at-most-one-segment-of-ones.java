class Solution {
    public boolean checkOnesSegment(String s) {
        boolean seen = false;
        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                if(seen) {
                    return false;
                }
            } else {
                if(ch == '0') seen = true;
            }
        }
        return true;
    }
}