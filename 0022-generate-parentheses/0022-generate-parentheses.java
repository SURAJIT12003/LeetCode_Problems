class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch  = s.charAt(i);
            if(ch==')'){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    char r  = st.peek();

                   // System.out.println(ch+" "+r);
                   
                    if(ch=='(' && r!=')'){
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

    public void rec(String s,int n,List<String> ans){
        if(s.length()==n){
            if(isValid(s)){
                ans.add(s);
            }
            return;
        }
        rec(s+"(",n,ans);
        rec(s+")",n,ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        rec("",n*2,ans);
      //  System.out.println(ans);
        return ans;
    }
}