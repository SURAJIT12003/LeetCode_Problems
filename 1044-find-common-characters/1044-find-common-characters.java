class Solution {
    public List<String> commonChars(String[] words) {
        int n = words.length;
        if (n<=1){
            List<String> arr = new ArrayList<>();
            return arr;
        }
        HashMap<Character,Integer> ans = new HashMap<>();
        for(int i=0;i<1;i++){
            String s="";
            s=s+words[i];
            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                if(ans.containsKey(ch)){
                    int get = ans.get(ch);
                    get=get+1;
                    ans.put(ch,get);
                }
                else{
                    ans.put(ch,1);
                }
            }
        }
        
        for(int i=1;i<n;i++){
            String s="";
            s+=words[i];
            HashMap<Character,Integer> hs = new HashMap<>();
            for(int j=0;j<s.length();j++){
                char ch = s.charAt(j);
                if(hs.containsKey(ch)){
                    int get = hs.get(ch);
                    get=get+1;
                    hs.put(ch,get);
                }
                else{
                    hs.put(ch,1);
                }
            }

            for(char ch :ans.keySet()){
                int get = ans.get(ch);
                if(hs.containsKey(ch)){
                    int get1 = hs.get(ch);
                    int m = Math.min(get,get1);
                    ans.put(ch,m);
                }
                else{
                    //ans.remove(ch);
                    ans.put(ch,0);
                }
            }
        }

        List<String> l = new ArrayList<>();
        for(char ch:ans.keySet()){
            int get = ans.get(ch);
            if(get==0){
                continue;
            }
            String s="";
            s=s+ch;
            for(int i=0;i<get;i++){
                 l.add(s);
            }
           
        }

        return l;


    }
}