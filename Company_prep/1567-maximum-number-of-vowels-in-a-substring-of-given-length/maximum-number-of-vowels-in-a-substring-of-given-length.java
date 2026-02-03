class Solution {
    public int maxVowels(String s, int k) {
      int count = 0;
      int maxVowels = 0;
      for(int i=0;i<k;i++) {
         char ch =  s.charAt(i);
         if(isVowel(ch)) {
            count++;
         }
      }
      maxVowels = count;
      for(int i=k;i<s.length();i++) {
         char chleft = s.charAt(i-k);
         if(isVowel(chleft))count--;
         char chright = s.charAt(i);
         if(isVowel(chright)) count++;
         maxVowels = Math.max(maxVowels,count);
      }
      return maxVowels;
    }
    private boolean isVowel(char c) {
        if(c == 'a' || c=='e' || c=='i' || c=='o'|| c=='u') {
            return true;
        }
        return false;
    }
}