class Solution {
    public int days(int[] weight, int mid){
        int day = 1;
        int load = 0;
        for(int n : weight){
            if(load+n>mid) {
                day++;
                load = n;
            } else {
                load+=n;
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();
        while(low<high) {
            int mid = low+(high-low)/2;
            int need = days(weights,mid);
            if(need<=days){
               high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}