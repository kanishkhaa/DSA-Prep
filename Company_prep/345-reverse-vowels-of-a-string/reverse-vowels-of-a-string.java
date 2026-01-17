class Solution {
    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length-1;
        while(left<right) {
            if(!isVowel(c[left])){
                left++;
            } else if(!isVowel(c[right])) {
                right--;
            } else {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            } 
        }
        return new String(c);
    }
}