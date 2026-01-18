class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for(String sen : sentences) {
            int count = sen.split(" ").length;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}