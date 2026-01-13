class Solution {
    public boolean checkIfPangram(String sentence) {
      Set<Character> s = new HashSet<>();
      for(char ch : sentence.toCharArray()) { 
          s.add(ch); 
      }
      return s.size()==26;
    }
}