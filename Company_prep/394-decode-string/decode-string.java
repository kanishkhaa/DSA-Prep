class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> st = new Stack<>();
        String curr = "";
        int k = 0;
        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                k = k*10+(ch-'0');
            } else if(ch=='[') {
                count.push(k);
                st.push(curr);
                curr = "";
                k=0;
            } else if(ch==']') {
                int repeat = count.pop();
                StringBuilder temp = new StringBuilder(st.pop());
                for(int i=0;i<repeat;i++) {
                    temp.append(curr);
                }
                curr = temp.toString();
            } else {
                curr+=ch;
            }
        }
        return curr;
    }
}