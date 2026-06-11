class Solution {
    public int sq(int n) {
        int s = 0;
       while(n > 0) {
          int d = n % 10;
          s += d * d;
          n/=10;
       }
       return s;
}
 public boolean isHappy(int n) {
    int i = sq(n);
    int j = sq(sq(n));
    while(i!=j) {
        if(j==1) return true;
        i = sq(i);
        j = sq(sq(j));
    }
    return i == 1;
 }
}