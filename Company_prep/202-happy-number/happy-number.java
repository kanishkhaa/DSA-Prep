class Solution {
    public int square(int n) {
        int res = 0;
        while(n>0) {
            int digit = n%10;
            res+=digit*digit;
            n/=10;
        }
        return res;
    }
    public boolean isHappy(int n) {
        int slow = square(n);
        int fast = square(square(n));
        while(slow!=fast) {
            if(fast == 1) return true;
            slow = square(slow);
            fast = square(square(fast));
        }
        return slow==1;
    }
}