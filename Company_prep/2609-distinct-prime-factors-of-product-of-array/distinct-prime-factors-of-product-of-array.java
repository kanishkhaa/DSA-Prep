class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) {
            int x = n;
            while(x%2==0) {
                set.add(2);
                x/=2;
            }
            for(int i=3;i*i<=x;i++) {
              while(x%i==0) {
                set.add(i);
                x/=i;
            }
          }
          if(x>1) set.add(x);
        }
        return set.size();
    }
}