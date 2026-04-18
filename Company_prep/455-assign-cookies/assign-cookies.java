class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m = g.length;
        int n = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int left = 0, right = 0;
        while(left<n && right<m) {
            if(s[left] >= g[right]) {
                right +=1;
            }
            left+=1;
        }
        return right;
    }
}