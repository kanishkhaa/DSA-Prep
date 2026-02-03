class Solution {
    private long total(int[] piles, int k) {
        long t = 0;
        for(int b : piles) {
            t+=(b+k-1)/k;
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles =  Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = maxPiles;
        int ans = maxPiles;
        while(low<=high) {
            int mid = low + (high-low)/2;
            long t = total(piles,mid);
            if(t<=h) {
                ans =  mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
}