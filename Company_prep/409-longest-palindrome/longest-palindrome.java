class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int odd = 0;
        for(char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch,0)+1);
            if(freq.get(ch)%2==1) {
                odd++;
            } else {
                odd--;
            }
        }
        if(odd>1) {
            return s.length() - odd+1;
        }
        return s.length();
    }
}