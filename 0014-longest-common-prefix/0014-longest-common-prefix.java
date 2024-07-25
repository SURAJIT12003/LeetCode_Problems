


class Solution {

    class node {
        node[] children = new node[26];
        boolean er = false;

        node() {
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }

   }  
    node root = new node();

    
    public  void create(String word[]){

        for(int i=0;i<word.length;i++){

            String s = word[i];

            node curr = root;
            for(int j=0;j<s.length();j++){

                int idx = s.charAt(j)-'a';

                if (curr.children[idx]==null){

                    curr.children[idx] = new node();
                }

                curr = curr.children[idx];
            }

            curr.er = true;

        }
    }

    public boolean check(node curr,int k){
        int c=0;
        for(int i=0;i<26;i++){
            if(curr.children[i]!=null){
                c++;
            }
        }
        //System.out.println(c);
        return c==1;
    }
    public  String in(String s){
        String ans ="";
        node curr = root;
        for(int i=0;i<s.length();i++){
            int in = s.charAt(i)-'a';
            if(!check(curr,i)){
                break;
            }
            ans = ans +s.charAt(i);
            curr = curr.children[in];
        }
        return ans ;

    }
    public String longestCommonPrefix(String[] strs) {
        create(strs);
        int in = Integer.MAX_VALUE;
        int d=0;
        for(int i=0;i<strs.length;i++){
            int t = strs[i].length();
            if(in>t){
                in=t;
                d=i;
            }
            //System.out.println(in);
        }
        return in(strs[d]);
    }
}