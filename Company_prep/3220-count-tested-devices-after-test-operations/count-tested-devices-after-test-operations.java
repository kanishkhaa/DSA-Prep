class Solution {
    public int countTestedDevices(int[] b) {
        int count = 0;
        for(int i =0;i<b.length;i++) {
            if(b[i] - count > 0) count++;
        }
        return count;
    }
}