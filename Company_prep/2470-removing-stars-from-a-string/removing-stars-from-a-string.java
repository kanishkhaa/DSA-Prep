class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c != '*') {
                st.push(c);
            } else if (c == '*') {
                st.pop();
            }
        }
        StringBuilder res = new StringBuilder();
        for(char c : st) {
           res.append(c);
        }
        return res.toString();
    }
}