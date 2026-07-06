class Solution {
    public void rot(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        rot(arr,0,n-1);
        rot(arr,0,k-1);
        rot(arr,k,n-1);
    }
}