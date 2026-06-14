class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char curr = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == curr) {
                stack.pop(); 
            } else {
                stack.push(curr);
            }
        }
        for(char ch : stack) {
            sb.append(ch);
        }
        return new String(sb);
    }
}