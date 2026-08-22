class Solution {
    public int dsum(int n) {
        int sum = 0;
        while(n!=0) {
            int temp = n %10;
            sum+=temp;
            n/=10;
        }
        return sum;
    }
    public int dpro(int n) {
        int pro = 1;
        while(n!=0) {
            int temp = n % 10;
            pro*=temp;
            n/=10;
        }
        return pro;
    }
    public boolean checkDivisibility(int n) {
        int a = dsum(n);
        int b = dpro(n);
        int c = a+b;
        return (n % c == 0) ? true : false;
    }
}