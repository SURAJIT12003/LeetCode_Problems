class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int first = 0;
        int last =0;
        int ans =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            last =i;
            if(hs.contains(ch)){
                while(hs.contains(ch) && first<=last){
                    hs.remove(s.charAt(first));
                    first++;
                }
            }
            hs.add(ch);
            int dis = (last-first)+1;
            ans = Math.max(ans,dis);
        }
        return ans;
    }
}