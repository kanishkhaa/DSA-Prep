class Solution {
    public int[] replaceElements(int[] arr) {
        int maxEle = -1;
        for(int i = arr.length-1;i>=0;i--) {
            int currEle = arr[i];
            arr[i] = maxEle;
            maxEle = Math.max(currEle, maxEle);
        }
        return arr;
    }
}