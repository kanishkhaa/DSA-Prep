class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++) {
            int left = i+1;
            int right = n-i;
            int leftodd = (left+1)/2;
            int lefteven = left/2;
            int rightodd = (right+1)/2;
            int righteven = right/2;
            int oddcount = leftodd*rightodd + lefteven * righteven;
            sum+=arr[i]*oddcount;
         }
         return sum;
    }
}