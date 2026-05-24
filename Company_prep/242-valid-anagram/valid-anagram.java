class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char ch : s.toCharArray()) {
            if(!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.getOrDefault(ch,0)-1);
            if(map.get(ch) <0) return false; 
        }
        return true;
    }
}