class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map map = new HashMap();
        String[] words = s.split(" ");
        if(pattern.length()!=words.length) return false;
        for(Integer i=0;i<words.length;++i) {
            if(map.put(pattern.charAt(i),i) != map.put(words[i],i)) return false;
        }
        return true;
    }
}