class Solution {
    int c =0;
    public boolean rec(int i,int j,String s){
        if(i>=j){
            return true;
        }
        boolean match = true;
        if(s.charAt(i)==s.charAt(j)){
            match  = rec(i+1,j-1,s);
        }
        else{
            if(c==1){
                return false;
            }
            c=1;
            boolean r = rec(i+1,j,s);
            boolean t = rec(i,j-1,s);
            if(r || t){
                return true;
            }
            return false;
        }
        return match;
    }
    public boolean validPalindrome(String s) {
        return rec(0,s.length()-1,s);
    }
}