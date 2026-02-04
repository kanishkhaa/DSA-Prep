class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] res = new int[t.length];
        Stack<Integer> s = new Stack<>();
        Arrays.fill(res,0);
        for(int i=0;i<t.length;i++) {
            while(!s.isEmpty() && t[s.peek()] < t[i]) {
               int prevIndex = s.pop();
               res[prevIndex] = i-prevIndex;
            }
            s.push(i);
        }
        return res;
    }
}