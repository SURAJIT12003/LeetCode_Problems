class Solution {
    public String compressedString(String word) {
        StringBuffer  ans = new StringBuffer();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int c = 0;
            int in =i;
            for(int j=i;j<word.length();j++){
                if(ch==word.charAt(j)){
                    in =j;
                    c++;
                }
                else{
                    break;
                }

                if(c==9){
                    in = j;
                    break;
                }
            }

           ans.append(c);
          ans.append(ch);
            i   = in;
        }

        return ans.toString();
    }
}