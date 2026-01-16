class Solution {
    public int thirdMax(int[] nums) {
        long first=Long.MIN_VALUE;
        long Second=Long.MIN_VALUE;
        long Third=Long.MIN_VALUE;
        for(int n:nums){
            if(n>first){
                Third=Second;
                Second=first;
                first=n;
            }else if(n>Second&&n!=first){
                Third=Second;
                Second=n;
            }else if(n>Third && n!=first&&n!=Second){
                Third=n;
            }
        }
        if (Third == Long.MIN_VALUE) {
            return (int) first;
        }
    return (int) Third;      
    }
}