class Solution {
    public boolean isAnagram(String a, String b) {
          
        HashMap<Character,Integer> hs  = new HashMap<>();
        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            if(hs.containsKey(ch)){
                int t = hs.get(ch);
                t++;
                hs.put(ch,t);
            }
            else{
                hs.put(ch,1);
            }
        }
        
         
        HashMap<Character,Integer> map  = new HashMap<>();
        for(int i=0;i<b.length();i++){
            char ch = b.charAt(i);
            if(map.containsKey(ch)){
                int t = map.get(ch);
                t++;
                map.put(ch,t);
            }
            else{
                map.put(ch,1);
            }
        }
        
        for(char ch:hs.keySet()){
            if(map.containsKey(ch)==false){
                return false;
            }
            int g =hs.get(ch);
            int nb = map.get(ch);
            if(g!=nb){
                return false;
            }
        }
          for(char ch:map.keySet()){
            if(hs.containsKey(ch)==false){
                return false;
            }
           
        }
        
        return true ;
    }
}