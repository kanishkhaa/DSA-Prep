class Solution {
    public int gcd(int a, int b) {
        while(b!=0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int odd = n * n;
        int even = n * (n + 1);
        return gcd(odd, even);
    }
}