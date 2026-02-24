class Solution {
    public String getHint(String secret, String guess)
     {
        int[] sc= new int[10];
        int[] gc = new int[10];
        int bulls = 0;
        int cows = 0;
        for(int i=0;i<secret.length();i++)
        {
           char s = secret.charAt(i);
           char  g = guess.charAt(i);
            if(s==g)
            {
               bulls++;
            }
            else
            {
                sc[s-'0']++;
                gc[g-'0']++;
            }
        }
        for(int i=0;i<10;i++)
        {
            cows+=Math.min(sc[i],gc[i]);
        }
        return bulls+"A"+cows+"B";
    }
}