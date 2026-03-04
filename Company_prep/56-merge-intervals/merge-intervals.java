class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0] , b[0]));
        List<List<Integer>> res = new ArrayList<>();
        for(int[] interval : intervals) {
            if(res.isEmpty() || res.get(res.size()-1).get(1) < interval[0]) {
                res.add(Arrays.asList(interval[0], interval[1]));
            } else {
                int last = res.size()-1;
                int max = Math.max(res.get(last).get(1) , interval[1]);
                res.get(last).set(1,max);
            }
        }
        int[][] ans = new int[res.size()][2];
        for(int i=0;i<res.size();i++) {
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }
        return ans;
    }
}