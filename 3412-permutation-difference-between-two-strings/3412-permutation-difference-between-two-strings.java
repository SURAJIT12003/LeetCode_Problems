class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> hs = new HashMap<>();
        int ans =0;
        for(int i=0;i<t.length();i++){
            hs.put(t.charAt(i),i);
        }
        for(int i=0;i<s.length();i++){
            int tk  = hs.get(s.charAt(i));
            int g = Math.abs(tk-i);
            ans+=g;
        }

        return ans;
    }
}