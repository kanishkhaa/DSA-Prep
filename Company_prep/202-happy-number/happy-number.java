class Solution {
    public boolean isHappy(int n)
    {
        HashSet<Integer> res = new HashSet<>();
        while(n!=1) {
            if(res.contains(n)) {
                return false;
            }
            res.add(n);
            n = square(n);
        }
        return true;
    }
    public int square(int num){
         int ans = 0;
         while(num>0)
         {
            int rem = num%10;
            ans+=rem*rem;
            num/=10;
         }
         return ans;
    }
}
