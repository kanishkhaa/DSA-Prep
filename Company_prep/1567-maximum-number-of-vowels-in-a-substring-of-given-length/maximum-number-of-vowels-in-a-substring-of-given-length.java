class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxcount = 0;
        for(int i = 0; i < k ;i++) {
            if(isvowel(s.charAt(i))) {
              count++;
            }
        }
        maxcount =  count;
        for(int i = k; i < s.length(); i++) {
            if(isvowel(s.charAt(i-k))) {
                count--;
            }
            if(isvowel(s.charAt(i))) {
                count++;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
    public boolean isvowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}