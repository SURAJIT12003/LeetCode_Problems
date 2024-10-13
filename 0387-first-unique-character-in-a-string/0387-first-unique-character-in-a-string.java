class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>hs =new HashMap<>();
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

        for(int i=0;i<s.length();i++){
            int g = hs.get(s.charAt(i));
            if(g==1){
                return i;
            }
        }
        return -1;
    }
}