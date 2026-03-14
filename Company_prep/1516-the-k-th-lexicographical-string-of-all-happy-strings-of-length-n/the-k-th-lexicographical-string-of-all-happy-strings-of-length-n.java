class Solution {
    List<String> res = new ArrayList<>();
    public String getHappyString(int n, int k) {
        backtrack("",n);
        if(k > res.size()) {
            return "";
        }
        return res.get(k-1);
    }
    public void backtrack(String curr , int n) {
        if(curr.length() == n) {
            res.add(curr);
            return;
        }
        for(char ch : new char[]{'a','b','c'}) {
            if(curr.length() > 0 && curr.charAt(curr.length()-1) == ch) {
                continue;
            }
            backtrack(curr+ch,n);
        }
    }
}