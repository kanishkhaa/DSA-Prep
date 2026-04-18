class Solution {
    public int reverse(int n) {
        int res = 0;
        while(n>0) {
            int d = n%10;
            res = res * 10 + d;
            n = n/10;
        }
        return res;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
}