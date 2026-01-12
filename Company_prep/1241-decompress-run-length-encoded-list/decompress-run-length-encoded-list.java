class Solution {
    public int[] decompressRLElist(int[] nums) {
      int total = 0;
      for(int i=0;i<nums.length;i+=2) {
         total+=nums[i];
      }
      int[] res = new int[total];
      int index = 0;
      for(int i=0;i<nums.length-1;i+=2) {
        int freq = nums[i];
        int val = nums[i+1];
        for(int j =0 ;j<freq;j++) {
         res[index] =  val;
         index++;
        }
      }
      return res;
    }
}