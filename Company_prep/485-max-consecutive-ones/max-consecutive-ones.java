class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count = 0;
        int max_count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                count++;
                if(count > max_count)
                {
                    max_count = count;
                }

            }
            else if(nums[i]==0)
            {
                count = 0;
            }
        }
        return max_count;
    }
}