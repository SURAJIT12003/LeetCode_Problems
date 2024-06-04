class Solution {
    public int longestPalindrome(String s) {
        int max =0;
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hs.containsKey(ch)){
                int g = hs.get(ch);
                g++;
                hs.put(ch,g);
            }
            else{
                hs.put(ch,1);
            }
        }

      // System.out.println(hs);
        int countEven =0;
        int countOdd =0;
        int maxOdd =0;
        int yt =0;

        for(char ch:hs.keySet()){
            int t = hs.get(ch);
            if(  t%2!=0 ){
                yt=1;
                t--;
                countOdd+=t;  
            }
            else{
                countEven+=t;
            }
        }

        max  = countEven+countOdd;
        if(yt==0){
            return max;
        }
        max++;
        return max;

    }
}