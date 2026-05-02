class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i=1 ; i<=n ; i++) {
            if(isgood(i)) {
                count++;
            }
        }
        return count;
    }
    private boolean isgood(int num) {
        boolean hasdifferent =  false;
        while(num > 0) {
            int digit  = num%10;
            if(digit == 3 || digit == 4 || digit == 7) {
                return false;
            }
            if(digit == 2 || digit  == 5 || digit == 6 || digit == 9) {
                hasdifferent = true;
            }
            num/=10;
        }
        return hasdifferent;
    }
}