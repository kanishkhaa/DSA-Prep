class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
      int i = 0;
      int j = 0;
      for(String str : commands) {
        if(str.equals("UP")) {
            i--;
        } else if(str.equals("LEFT")) {
            j--;
        } else if(str.equals("RIGHT")) {
            j++;
        } else {
            i++;
        }
      }
      return (i*n) + j;
    }
}