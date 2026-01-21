class Solution {
    public int sum(int n) {
        int total = 0;
        while(n>0) {
            int digit = n%10;
            total+=digit;
            n/=10;
        }
        return total;
    }
    public int countBalls(int lowLimit, int highLimit) {
        int[] res = new int[46];
        int max = 0;
        for(int i=lowLimit;i<=highLimit;i++) {
            int index = sum(i);
            res[index]++;
            max = Math.max(max,res[index]); 
        }
        return max;
    }
}