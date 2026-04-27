class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int maximum = 0;
        for(int c : candies) {
            if(c>maximum) {
                maximum = c;
            }
        }
        for(int i=0;i<candies.length;i++) {
            if(candies[i] + extraCandies >= maximum) {
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}