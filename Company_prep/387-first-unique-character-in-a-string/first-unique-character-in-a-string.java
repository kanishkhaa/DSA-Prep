class Solution {
    public int firstUniqChar(String s) 
    {
        int index = -1;
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char ch: s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(map.get(c)==1) {
                index = i;
                break;
            }
        }
        return index;
    }
}