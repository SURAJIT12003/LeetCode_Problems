class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int left = 0;
        int right = 0;
        int length =0;
        int n = s.length();
        HashMap<Character, Integer> hs = new HashMap<>();
        int ans = 0;

        while (right < n) {
            char ch = s.charAt(right);
            length++;
            if (hs.containsKey(ch)) {
                int t = hs.get(ch);
                t++;
                hs.put(ch, t);
                max = Math.max(max, t);
            } else {
                hs.put(ch, 1);
                max = Math.max(max, 1);
            }

            if(k<length-max){
                int nMax =0;
                while(left<=right){
                    int f = hs.get(s.charAt(left));
                    f--;
                    length--;
                    for(char chf:hs.keySet()){
                        nMax = Math.max(nMax,hs.get(chf));
                    }
                  
                    hs.put(s.charAt(left),f);
                    
                 
                    left++;
                    if(k>=length-nMax){
                        break;
                    }
                }
                max = nMax;
            }
            if(k>=length-max){
                ans = Math.max(ans,(right-left+1));
            }
            
            right++;
        }

        return ans;

    }
}