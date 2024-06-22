class Solution {
    public int maximumLengthSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i));
        }

        int size = hs.size();
        int left = 0;
        int right =0;
        int max =0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            right = i;
            if(map.containsKey(curr)){
                if(map.get(curr)==2){
                    for(int j=left;j<s.length();j++){
                        
                        if(s.charAt(j)==curr){
                            left = j+1;
                            break;
                        }
                        int g = map.get(s.charAt(j));
                        g--;
                        if(g==0){
                            map.remove(s.charAt(j));
                        }
                        else{
                             map.put(s.charAt(j),g);
                        }
                       
                    }
                }
                else{
                    map.put(curr,2);
                }
            }
            else{
                map.put(curr,1);
            }

           // if(map.size()==size){
               // System.out.println(right+" "+left);
                int l = (right-left)+1;
                max = Math.max(max,l);
           // }
        }

        return max;
    }
}