class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        String digits= "123456789";
        int l = String.valueOf(low).length();
        int h = String.valueOf(high).length();
        for(int i=l;i<=h;i++) {
            for(int j = 0;j+i<=9;j++) {
               int num = Integer.parseInt(digits.substring(j,j+i));
               if(num >= low && num<=high) {
                  res.add(num);
               }
            }
        }
        return res;
    }
}