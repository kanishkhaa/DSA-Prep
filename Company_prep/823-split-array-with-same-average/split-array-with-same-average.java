class Solution {
    public boolean splitArraySameAverage(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums) {
            sum+=num;
        }
        List<Set<Integer>> dp = new ArrayList<>();
        for(int i=0;i<=n/2;i++) {
            dp.add(new HashSet<>());
        }
        dp.get(0).add(0);
        for(int num : nums) {
            for(int i=n/2;i>=1;i--) {
                for(int prev : dp.get(i-1)) {
                    dp.get(i).add(prev+num);
                }
            }
        }
        for(int k=1;k<=n/2;k++) {
            if((sum*k) % n == 0) {
                int target = (sum*k)/n;
                if(dp.get(k).contains(target)) {
                    return true;
                }
            }
        }
        return false;
    }
}