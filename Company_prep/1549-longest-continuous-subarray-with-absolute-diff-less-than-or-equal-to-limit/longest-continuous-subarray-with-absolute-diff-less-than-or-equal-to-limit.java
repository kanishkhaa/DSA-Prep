class Solution {
    public int longestSubarray(int[] nums, int k) {
        Deque<Integer> max = new LinkedList<>();
        Deque<Integer> min = new LinkedList<>();
        int left = 0, ans = 0;
        int n = nums.length;
        for(int right = 0;right < n; right++) {
            while(!max.isEmpty() && nums[max.peekLast()] < nums[right]) {
                max.pollLast();
            }
            max.offerLast(right);
            while(!min.isEmpty() && nums[min.peekLast()] > nums[right]) {
                min.pollLast();
            }
            min.offerLast(right);
            while(nums[max.peekFirst()] - nums[min.peekFirst()] > k) {
                if(max.peekFirst() == left) {
                    max.pollFirst();
                }
                if(min.peekFirst() == left) {
                    min.pollFirst();
                }
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}