class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char c : word.toCharArray()) {
            set.add(c);
        }
        for(char c = 'A' ; c <='Z' ; c++) {
            if(set.contains(c) && set.contains(Character.toLowerCase(c))) {
                count++;
            }
        }
        return count;
    }
}