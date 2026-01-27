class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
       HashMap<Integer,Integer> s = new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
         int num = nums[i];
         int com = target - num;
         if(s.containsKey(com))
         {
            return new int[]{s.get(com),i};
         }
         s.put(num,i);
       } 
       return new int[]{-1,-1};
    }
}