class Solution {
    public int strStr(String s, String str) {
        
        int n = s.length();
        int m = str.length();
        if(n<m){
            return -1;
        }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c==str.charAt(0)){
                if(i+m>n){
                    continue;
                }
                String d =s.substring(i,i+m);
                if(d.equals(str)){
                    return i;
                }
            }
        }

        return -1;
    }
}