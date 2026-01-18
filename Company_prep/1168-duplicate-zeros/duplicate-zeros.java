class Solution {
    public void duplicateZeros(int[] arr) {
        int pos = 0;
        int len = arr.length;
        int[] res = new int[len];
        for(int i = 0; i < len; i++) {
            if(pos >= len) break;
            if(arr[i] == 0) {
                res[pos++] = 0;
                if(pos >= len) break;
                res[pos++] = 0;
            } else {
                res[pos++] = arr[i];
            }
        }
        for(int i = 0; i < len; i++) {
            arr[i] = res[i];
        }
    }
}
