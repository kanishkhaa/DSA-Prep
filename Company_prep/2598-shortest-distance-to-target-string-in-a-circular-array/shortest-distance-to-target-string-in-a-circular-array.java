class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
       int n = words.length;
       int mindist =  Integer.MAX_VALUE;
       for(int i=0;i<n;i++) {
          if(words[i].equals(target)) {
            int clock = (i-startIndex + n) % n;
            int anticlock = (startIndex - i + n) % n;
            int dist =  Math.min(clock, anticlock);
            mindist = Math.min(mindist, dist);
          }
       }
       return mindist == Integer.MAX_VALUE ? -1 : mindist;
    }
}