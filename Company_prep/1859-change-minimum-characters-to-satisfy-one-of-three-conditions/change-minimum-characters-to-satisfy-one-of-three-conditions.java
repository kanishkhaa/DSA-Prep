class Solution {
    public int minCharacters(String a, String b) {
        int[] freqA = new int[26];
        int[] freqB = new int[26];
        for(char ch : a.toCharArray()) {
            freqA[ch-'a']++;
        }
        for(char ch : b.toCharArray()) {
            freqB[ch-'a']++;
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<25;i++) {
            int changes= 0;
            for(int j=i+1;j<26;j++) {
                changes+=freqA[j];
            }
            for(int j=0;j<=i;j++) {
                changes+=freqB[j];
            }
            ans = Math.min(ans,changes);
        }
        for(int i=0;i<25;i++) {
            int changes = 0;
            for(int j=i+1;j<26;j++) {
                changes+=freqB[j];
            }
            for(int j=0;j<=i;j++) {
                changes+=freqA[j];
            }
            ans = Math.min(ans,changes);
        }
        int maxA = 0;
        int maxB = 0;
        for(int i=0;i<26;i++) {
            maxA = Math.max(maxA,freqA[i]);
            maxB = Math.max(maxB,freqB[i]);
        }
        int cond = (a.length() - maxA) + (b.length() - maxB);
        ans = Math.min(ans,cond);
        return ans;
    }
}