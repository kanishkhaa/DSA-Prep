class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int temp = Math.abs(x);
        while(temp != 0) {
            int d = temp%10;
            rev =  rev*10+d;
            temp/=10;
        }
        return rev == x;
    }
}