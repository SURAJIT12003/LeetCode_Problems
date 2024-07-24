class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch  = s.charAt(i);
            if(ch=='}' || ch==']' || ch==')'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    char r  = st.peek();

                   // System.out.println(ch+" "+r);
                   
                    if(ch=='(' && r!=')'){
                        return false;
                    }
                    else if(ch=='{' && r!='}'){
                        return false;
                    }
                    else if(ch=='[' && r!=']'){
                        return false;
                    }
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
              //System.out.println(st);


        }

        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}