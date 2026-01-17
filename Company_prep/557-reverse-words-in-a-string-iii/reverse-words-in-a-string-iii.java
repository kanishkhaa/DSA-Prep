class Solution {
    public void rev(char[] word) {
        int left = 0;
        int right = word.length-1;
        while(left<right) {
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }
    }
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++) {
            char[] ch = words[i].toCharArray();
            rev(ch);
            sb.append(new String(ch));
            if(i<words.length-1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}