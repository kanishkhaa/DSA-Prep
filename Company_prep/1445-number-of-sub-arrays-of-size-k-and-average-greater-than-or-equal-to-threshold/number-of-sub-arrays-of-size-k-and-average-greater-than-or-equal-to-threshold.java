class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int maxCount = 0;
        int sum = 0;
        int maxSum = threshold;
        for(int i=0;i<k;i++) {
           sum+=arr[i];
        }
        if(sum/k >= maxSum) {
              count++;
           }
        for(int i=k;i<arr.length;i++) {
            sum+=arr[i] - arr[i-k];
            if(i>=k-1) {
            if(sum/k >= maxSum) {
                count++;
            }
          }
        }
        return count;
    }
}