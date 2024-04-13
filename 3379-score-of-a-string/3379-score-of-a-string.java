class Solution {
    public int scoreOfString(String s) {
        int ans =0;
        for(int i=0;i<s.length()-1;i++){
            int t = s.charAt(i);
            int g = s.charAt(i+1);
            ans = ans + Math.abs(t-g);
        }
        return ans;
    }
}