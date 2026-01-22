class Solution {
    public int ladderLength(String bw, String ew, List<String> wl) {
        Set<String> s = new HashSet<>();
        int f = 0;
        for(String word: wl) {
            if(word.compareTo(ew)==0) {
                f = 1;
            }
            s.add(word);
        }
        if(f==0) return 0;
        Queue<String> q = new LinkedList<>();
        q.add(bw);
        int level = 1;
        while(!q.isEmpty()) {
            int lsize = q.size();
            while(lsize-- > 0) {
                String curr = q.poll();
                for(int i=0;i<curr.length();i++) {
                   StringBuilder sb = new StringBuilder(curr);
                   StringBuilder temp = sb;
                   for(char c='a';c<='z';c++) {
                    temp.setCharAt(i,c);
                    String temp1 = sb.toString();
                    if(temp1.compareTo(curr)==0)
                       continue;
                    if(temp1.compareTo(ew) == 0)
                        return level+1;
                    if(s.contains(temp1)) {
                        q.add(temp1);
                        s.remove(temp1);
                    }
                   }
                }
            }
            level++;
        }
        return 0;
    }
}