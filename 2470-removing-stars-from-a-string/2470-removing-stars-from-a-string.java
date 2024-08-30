class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='*'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    st.push(ch);
                }
                else{
                    char c  = st.peek();
                    if(c=='*'){
                        st.pop();
                    }
                    else{
                        st.push(ch);
                    }
                }
            }
        }

        String ans = "";
        while(!st.isEmpty()){
            ans=ans+st.pop();
        }
        return ans;
    }
}