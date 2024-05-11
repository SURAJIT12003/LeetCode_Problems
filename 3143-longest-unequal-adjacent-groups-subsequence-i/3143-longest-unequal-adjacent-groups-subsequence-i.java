class Solution {
    List<String>ans = new ArrayList<>();
    int max =0;

    public void rec(int index,String words[],int groups[],int prev,List<String>st){
        if(index==words.length){
          //  System.out.println(st);
            if(max<st.size()){
                max = st.size(); 
                List<String>df = new ArrayList<>();
                df.addAll(st);
                ans.removeAll(ans);
                ans.addAll(df);
            }
           
              
            
            return;
        }


        if(prev!=groups[index] || prev==-1){
            st.add(words[index]);
            rec(index+1,words,groups,groups[index],st);
            st.remove(st.size()-1);
            rec(index+1,words,groups,prev,st);
        }
        else{
            //rec(index+1,words,groups,prev,st);
        }
       
    }
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        rec(0,words,groups,-1,new ArrayList<>());
      
        return ans;
    }
}