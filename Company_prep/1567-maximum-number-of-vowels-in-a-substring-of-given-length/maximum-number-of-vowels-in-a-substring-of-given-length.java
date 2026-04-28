class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxcount = 0;
        for(int i=0;i<k;i++) {
            char ch = s.charAt(i);
            if(isvowel(ch)) {
                count++;
            }
        }
        maxcount = count;
        for(int i=k;i<s.length();i++) {
            char chleft = s.charAt(i-k);
            if(isvowel(chleft)) {
                count--;            
            } 
            char chright = s.charAt(i);
            if(isvowel(chright)) {
                count++;
            }
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }
    private boolean isvowel(char ch) {
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }

}