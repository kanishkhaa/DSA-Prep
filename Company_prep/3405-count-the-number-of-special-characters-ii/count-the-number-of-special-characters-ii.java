class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();
        for(char ch : word.toCharArray()) {
            if(Character.isLowerCase(ch)) lower.add(ch);
            else upper.add(ch);
        }
        int count = 0;
        for(char c = 'a' ; c <= 'z' ; c++) {
            if(lower.contains(c) && upper.contains(Character.toUpperCase(c))) {
                int lastlower = word.lastIndexOf(c);
                int firstupper = word.indexOf(Character.toUpperCase(c));
                if(lastlower < firstupper) count++;
            }
        }
        return count;
    }
}