class Solution {
    public boolean checkString(String s) {
        int lastIndexOfA = s.lastIndexOf('a');
        int firstIndexOfB = s.indexOf('b');
        if(lastIndexOfA ==-1 || firstIndexOfB == -1) {
            return true;
        }
        return lastIndexOfA < firstIndexOfB;
    }
}