class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] window = new int[26];
        int[] freq = new int[26];
        if(p.length() > s.length()) return res;
         for(char c : p.toCharArray()) {
            freq[c-'a']++;
        }
        int k = p.length();
        for(int i=0;i<s.length();i++) {
            window[s.charAt(i)-'a']++;
            if(i>=k) {
                window[s.charAt(i-k)-'a']--;
            }
            if(i>=k-1) {
                if(matches(window,freq)) {
                    res.add(i-k+1);
                }
            }
        }
        return res;
    }
    private boolean matches(int[]a, int[]b) {
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}