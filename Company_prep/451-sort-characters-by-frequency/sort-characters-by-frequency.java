class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> res = new PriorityQueue<>((a,b) -> freq.get(b) - freq.get(a));
        res.addAll(freq.keySet());
        StringBuilder sb = new StringBuilder();
        while(!res.isEmpty()) {
            char ch = res.poll();
            int count = freq.get(ch);
            for(int i=0;i<count;i++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}