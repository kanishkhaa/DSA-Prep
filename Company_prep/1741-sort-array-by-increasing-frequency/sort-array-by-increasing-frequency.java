class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> res = new ArrayList<>(freq.keySet());
        Collections.sort(res,(a,b) -> {
            if(freq.get(a) != freq.get(b)) {
                return freq.get(a) - freq.get(b);
            }
            return b-a;
        });
        int[] ans = new int[nums.length];
        int index = 0;
        for(int n:res) {
            int frequency = freq.get(n);
            for(int i=0;i<frequency;i++) {
                ans[index++] = n;
            } 
        }
        return ans;
    }
}