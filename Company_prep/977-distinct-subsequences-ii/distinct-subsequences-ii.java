class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1000000007;
        long dp = 1;
        long[] last = new long[26];
        for(char c : s.toCharArray()) {
            int index = c - 'a';
            long newdp = (2 * dp - last[index] + MOD) % MOD;
            last[index] = dp;
            dp = newdp;
        }
        return (int)((dp - 1 + MOD) % MOD);
    }
}