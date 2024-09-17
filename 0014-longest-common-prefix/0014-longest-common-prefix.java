class Solution {

    public boolean check(int index, String strs[]) {
        int i = 0;
        int n = strs.length;
        HashSet<Character> hs = new HashSet<>();
        while (i < n) {
            if (strs[i].length() > index) {
                char ch = strs[i].charAt(index);
                hs.add(ch);
            }
            else{
                hs.add('0');
            }
            i++;

        }

        if(hs.size()==1){
            return true;
        }
        return false;
    }

    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int n = 0;
        for(String sk:strs){
            n = Math.max(n,sk.length());
        }
        int index =0;
      String ans = "";
        while(index<n){
            if(!check(index,strs)){
                break;
            }
            char ch = strs[0].charAt(index);
            ans+=ch;
            index++;
        }
        return ans;
    }
}