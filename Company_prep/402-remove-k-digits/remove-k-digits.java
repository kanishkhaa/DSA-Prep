class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k>=n) return "0";
        Stack<Character> stack = new Stack<>();
        for(char digit : num.toCharArray()) {
            while(!stack.isEmpty() && k>0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k>0) {
            stack.pop();
            k--;
        }
        boolean zero = true;
        StringBuilder sb = new StringBuilder();
        for(char ch: stack) {
            if(zero && ch == '0') {
                continue;
            }
            zero = false;
            sb.append(ch);
        } 
        return sb.length() == 0 ? "0" : sb.toString();
    }
}