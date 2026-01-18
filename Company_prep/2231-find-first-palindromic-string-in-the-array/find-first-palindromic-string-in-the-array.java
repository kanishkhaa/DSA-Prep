class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase();
         String rev="";
         for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }
    public String firstPalindrome(String[] words) {
        for(String ch : words){
            if(isPalindrome(ch)) {
                return ch;
            }
        }
        return "";
    }
}