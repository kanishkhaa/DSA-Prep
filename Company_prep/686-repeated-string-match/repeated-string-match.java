class Solution {
    public int repeatedStringMatch(String a, String b) {
        int repeat = (int)Math.ceil((double)b.length()/(double)a.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<repeat;i++) {
            sb.append(a);
        }
        if(sb.toString().contains(b)) {
            return repeat;
        }
        sb.append(a);
        if(sb.toString().contains(b)){
            return repeat+1;
        }
        return -1;
    }
}