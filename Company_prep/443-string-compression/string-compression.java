class Solution {
    public int compress(char[] chars) 
    {
       int i = 0;
       int j = 0;
       while(i<chars.length) {
         char curr = chars[i];
         int count = 0;
         while(i<chars.length && chars[i] == curr) { 
              i++;
              count++;
         }
         chars[j++] = curr;
         if(count > 1) {
            for(char c : String.valueOf(count).toCharArray()) {
                chars[j++] = c;
            }
         }
       }
       return j;
    }
}