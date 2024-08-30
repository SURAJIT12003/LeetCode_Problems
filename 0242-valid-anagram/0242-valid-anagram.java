class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer>map=new HashMap<>();
    HashMap<Character,Integer>map2=new HashMap<>();

    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(map.containsKey(ch)){
            int freq=map.get(ch);
            freq++;
            map.put(ch,freq);
        }
        else{
           map.put(ch,1);
        }
        
    }
    for(int i=0;i<t.length();i++){
         char vh =t.charAt(i); 
         if(map2.containsKey(vh)){
            int freq2=map2.get(vh);
            freq2++;
            map2.put(vh,freq2);
         }
         else{
            map2.put(vh,1);
         }
    }
    for(char p:map.keySet() ){
        if(map2.containsKey(p)==false){
            return false;
        }
        int g  = map.get(p);
        int h = map2.get(p);
        if(g!=h){
            return false;
        }
    }

     for(char  p:map2.keySet()){
        if(map.containsKey(p)==false){
            return false;
        }
        int g  = map.get(p);
        int h = map2.get(p);
        if(g!=h){
            return false;
        }
     }
     return true;
    }
}