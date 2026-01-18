class Solution {
    public boolean isEven(int num) {
        int count = 0;
        while(num>0) {
            int digit = num%10;
            count++;
            num=num/10;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int n : nums) {
            if(isEven(n)) {
               c++;
            }
        }
        return c;
    }
}