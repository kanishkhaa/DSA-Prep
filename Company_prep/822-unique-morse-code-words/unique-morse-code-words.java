class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set<String> res = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(morse[c - 'a']); 
            }
            res.add(sb.toString());
        }
        return res.size();
    }
}
